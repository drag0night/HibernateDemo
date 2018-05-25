/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Book;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface BookDaoInterface {
    
    List<Book> findAll();
    
    Book find(int id);
    
    void create(Book entity);
    
    void edit(Book entity);
    
    void remove(Book entity);
    
}
