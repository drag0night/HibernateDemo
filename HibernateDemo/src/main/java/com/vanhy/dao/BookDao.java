/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Book;

/**
 *
 * @author VAN
 */
public class BookDao extends AbstractFacade<Book> implements BookDaoInterface{
    
    public BookDao() {
        super(Book.class);
    }
    
}
