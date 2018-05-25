/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Address;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface AddressDaoInterface {
    
    List<Address> findAll();
    
    Address find(int id);
    
    void create(Address entity);
    
    void edit(Address entity);
    
    void remove(Address entity);
    
}
