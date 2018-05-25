/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Reader;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface ReaderDaoInterface {
    
    List<Reader> findAll();
    
    Reader find(int id);
    
    void create(Reader entity);
    
    void edit(Reader entity);
    
    void remove(Reader entity);
    
}
