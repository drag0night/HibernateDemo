/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.facade;

import com.vanhy.entity.Borrowbook;
import com.vanhy.entity.Borrowlist;
import java.util.Objects;
import java.util.Set;

public class BorrowListFacade {
    private Borrowlist borrowlist;
    
    public BorrowListFacade(Borrowlist borrowlist) {
        this.borrowlist = borrowlist;
    }
    
    public Borrowlist updateBorrow(Borrowbook bBook) {
        Set<Borrowbook> borrows = borrowlist.getBorrowbooks();
        int amount = 0;
        int kt = 0;
        for (Borrowbook borrow : borrows) {
            if (Objects.equals(bBook.getBook().getId(), borrow.getBook().getId())) {
                kt = 1;
                amount += bBook.getQuantity() * bBook.getBook().getPrice();
            } else {
                amount += borrow.getQuantity() * borrow.getBook().getPrice();
            }
        }
        if (kt == 0) {
            amount += bBook.getQuantity() * bBook.getBook().getPrice();
        }
        borrowlist.setAmount(amount);
        return borrowlist;
    }
    
    public Borrowbook checkBookInBorrow(int idBook) {
        Set<Borrowbook> borrows = borrowlist.getBorrowbooks();
        for (Borrowbook borrow : borrows) {
            if (Objects.equals(idBook, borrow.getBook().getId())) {
                return borrow;
            }
        }
        return null;
    }
}
