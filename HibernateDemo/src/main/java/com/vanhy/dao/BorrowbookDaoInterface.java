/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Borrowbook;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface BorrowbookDaoInterface {
    
    List<Borrowbook> findAll();
    
    Borrowbook find(int id);
    
    void create(Borrowbook entity);
    
    void edit(Borrowbook entity);
    
    void remove(Borrowbook entity);
    
}
