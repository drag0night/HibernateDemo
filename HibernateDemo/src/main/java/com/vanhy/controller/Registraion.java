
package com.vanhy.controller;

import com.vanhy.dao.AccountDao;
import com.vanhy.dao.AccountDaoInterface;
import com.vanhy.dao.AddressDao;
import com.vanhy.dao.AddressDaoInterface;
import com.vanhy.dao.FullnameDao;
import com.vanhy.dao.FullnameDaoInterface;
import com.vanhy.dao.PersonDao;
import com.vanhy.dao.PersonDaoInterface;
import com.vanhy.dao.ReaderDao;
import com.vanhy.dao.ReaderDaoInterface;
import com.vanhy.entity.Account;
import com.vanhy.entity.Address;
import com.vanhy.entity.Fullname;
import com.vanhy.entity.Person;
import com.vanhy.entity.Reader;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Registraion {
    
    private AccountDaoInterface accDao = new AccountDao();
    private AddressDaoInterface addrDao = new AddressDao();
    private FullnameDaoInterface nameDao = new FullnameDao();
    private PersonDaoInterface personDao = new PersonDao();
    private ReaderDaoInterface readerDao = new ReaderDao();
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistration (){
        return "registration";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String checkRegistration (HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        if ((null != username && !"".equals(username)) 
                && (null != password && !"".equals(password))
                && (null != fullname && !"".equals(fullname))
                && (null != address && !"".equals(address))) {
            
            if (!accDao.checkUsername(username)) {
                //Create Fullname
                String[] arrName = fullname.split(" ");
                String firstName = arrName[arrName.length - 1];
                String lastName = "";
                for (int i = 0; i < arrName.length-1; i++) {
                    lastName += " " + arrName[i];
                }
                lastName = lastName.substring(1, lastName.length());
                Fullname name = new Fullname();
                name.setFirstName(firstName);
                name.setLastName(lastName);
                nameDao.create(name);
                
                //Create Address
                Address addr = new Address();
                addr.setCity(address);
                addrDao.create(addr);
                
                //Create Person
                Person person = new Person();
                person.setFullname(name);
                person.setAddress(addr);
                personDao.create(person);
                
                //Create Account
                Account acc = new Account();
                acc.setUsername(username);
                acc.setPassword(password);
                acc.setPerson(person);
                accDao.create(acc);
                
                //Create Reader
                Reader reader = new Reader();
                reader.setPerson(person);
                readerDao.create(reader);
                
                person.setReader(reader);
                acc.setPerson(person);
                session.setAttribute("user", acc);
                
            } else {
                request.setAttribute("msg", "exist");
                return "registration";
            }
        } else {
            request.setAttribute("msg", "empty");
            return "registration";
        }
        return "redirect:/listbook";
    }
    
}
