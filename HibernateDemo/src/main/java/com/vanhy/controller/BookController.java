
package com.vanhy.controller;

import com.vanhy.dao.BookDao;
import com.vanhy.dao.BookDaoInterface;
import com.vanhy.entity.Book;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
    
    private BookDaoInterface bookDao = new BookDao();
    
    @RequestMapping(value = "/listbook", method = RequestMethod.GET)
    public String showListBook(HttpSession session) {
        List<Book> books = bookDao.findAll();
        if (books != null) {
            session.setAttribute("books", books);
        }
        return "listbook";
    }
    
}
