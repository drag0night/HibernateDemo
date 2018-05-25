/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.facade;

import com.vanhy.entity.Borrowlist;
import com.vanhy.entity.Reader;
import java.util.Set;

/**
 *
 * @author VAN
 */
public class ReaderFacade {
    private Reader reader;
    
    public ReaderFacade(Reader reader) {
        this.reader = reader;
    }
    
    public Borrowlist getCurrentBorrow() {
        Set<Borrowlist> borrows = reader.getBorrowlists();
        for (Borrowlist borrow : borrows) {
            if ( borrow.getStaff()==null ) {
                return borrow;
            }
        }
        return null;
    }

}
