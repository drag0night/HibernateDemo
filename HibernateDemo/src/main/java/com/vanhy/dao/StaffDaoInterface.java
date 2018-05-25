/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Staff;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface StaffDaoInterface {
    
    List<Staff> findAll();
    
    Staff find(int id);
    
    void create(Staff entity);
    
    void edit(Staff entity);
    
    void remove(Staff entity);
    
}
