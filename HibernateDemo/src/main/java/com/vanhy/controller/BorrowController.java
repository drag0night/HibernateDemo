/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.controller;

import com.vanhy.dao.BookDao;
import com.vanhy.dao.BookDaoInterface;
import com.vanhy.dao.BorrowbookDao;
import com.vanhy.dao.BorrowbookDaoInterface;
import com.vanhy.dao.BorrowlistDao;
import com.vanhy.dao.BorrowlistDaoInterface;
import com.vanhy.entity.Account;
import com.vanhy.entity.Book;
import com.vanhy.entity.Borrowbook;
import com.vanhy.entity.Borrowlist;
import com.vanhy.entity.Reader;
import com.vanhy.facade.BorrowListFacade;
import com.vanhy.facade.ReaderFacade;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BorrowController {
    
    private BorrowlistDaoInterface borrowListDao = new BorrowlistDao();
    
    private BorrowbookDaoInterface borrowBookDao = new BorrowbookDao();
    
    private BookDaoInterface bookDao = new BookDao();
    
    @RequestMapping(value = "/borrowlist", method = RequestMethod.GET)
    public String showBorrow(HttpSession session) {
        Set<Borrowbook> borrows = (Set<Borrowbook>) session.getAttribute("borrows");
        if (borrows != null & borrows.size() > 0) {
            session.setAttribute("borrows", borrows);
        }
        return "borrow";
    }
    
    @RequestMapping(value = "/borrow", method = RequestMethod.GET)
    public String doBorrow(HttpSession session, HttpServletRequest request) {
        Account user = (Account) session.getAttribute("user");
        Reader reader = user.getPerson().getReader();
        ReaderFacade readerFacade = new ReaderFacade(reader);
        Borrowlist borrowList = readerFacade.getCurrentBorrow();
        int id_book = Integer.parseInt(request.getParameter("id"));
        Book book = bookDao.find(id_book);
        int quantity = 1;
        Set<Borrowbook> borrows = new HashSet<Borrowbook>();
        if (borrowList == null) {
            borrowList = new Borrowlist();
            borrows = new HashSet<Borrowbook>();
            borrowList.setReader(reader);
            borrowList.setAmount(0);
            borrowListDao.create(borrowList);
            BorrowListFacade bListFacade = new BorrowListFacade(borrowList);
            Borrowbook bBook = new Borrowbook();
            bBook.setBook(book);
            bBook.setQuantity(quantity);
            borrowList = bListFacade.updateBorrow(bBook);
            bBook.setBorrowlist(borrowList);
            borrowBookDao.create(bBook);
            borrows.add(bBook);
        } else {
            borrows = borrowList.getBorrowbooks();
            BorrowListFacade bListFacade = new BorrowListFacade(borrowList);
            Borrowbook bBook = bListFacade.checkBookInBorrow(id_book);
            if (bBook == null) {
                bBook = new Borrowbook();
                bBook.setBook(book);
                bBook.setQuantity(quantity);
                borrowList = bListFacade.updateBorrow(bBook);
                bBook.setBorrowlist(borrowList);
                borrowBookDao.create(bBook);
                borrows.add(bBook);
            } else {
                int num = bBook.getQuantity() + quantity;
                bBook.setQuantity(num);
                bBook.setBorrowlist(borrowList);
                borrowBookDao.edit(bBook);
                borrows.add(bBook);
            }
        }
        session.setAttribute("borrows", borrows);
        return "redirect:/borrowlist";
    }
}
