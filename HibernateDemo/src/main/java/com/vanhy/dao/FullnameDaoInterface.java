/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Fullname;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface FullnameDaoInterface {
    
    List<Fullname> findAll();
    
    Fullname find(int id);
    
    void create(Fullname entity);
    
    void edit(Fullname entity);
    
    void remove(Fullname entity);
}
