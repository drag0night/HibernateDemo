/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Borrowlist;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface BorrowlistDaoInterface {
    
    List<Borrowlist> findAll();
    
    Borrowlist find(int id);
    
    void create(Borrowlist entity);
    
    void edit(Borrowlist entity);
    
    void remove(Borrowlist entity);
    
}
