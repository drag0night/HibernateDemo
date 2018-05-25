package com.vanhy.controller;

import com.vanhy.dao.AccountDao;
import com.vanhy.dao.AccountDaoInterface;
import com.vanhy.entity.Account;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private final AccountDaoInterface accDao = new AccountDao();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView userLogin(HttpSession session) {
        return new ModelAndView("index", "command", new Account());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute("account") Account acc, HttpSession session, Model model) {
        Account user = accDao.checkLogin(acc);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/listbook";
        } else {
            session.setAttribute("msg", "login fail");
            return "redirect:/";
        }
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
