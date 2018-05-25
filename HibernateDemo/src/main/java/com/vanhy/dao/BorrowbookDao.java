/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Borrowbook;

/**
 *
 * @author VAN
 */
public class BorrowbookDao extends AbstractFacade<Borrowbook> implements BorrowbookDaoInterface{
    
    public BorrowbookDao() {
        super(Borrowbook.class);
    }
    
}
