/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Borrowlist;

/**
 *
 * @author VAN
 */
public class BorrowlistDao extends AbstractFacade<Borrowlist> implements BorrowlistDaoInterface{
    
    public BorrowlistDao() {
        super(Borrowlist.class);
    }
    
}
