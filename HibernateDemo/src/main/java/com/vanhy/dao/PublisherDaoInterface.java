/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Publisher;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface PublisherDaoInterface {
    
    List<Publisher> findAll();
    
    Publisher find(int id);
    
    void create(Publisher entity);
    
    void edit(Publisher entity);
    
    void remove(Publisher entity);
    
}
