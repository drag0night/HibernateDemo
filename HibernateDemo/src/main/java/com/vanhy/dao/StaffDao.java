/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Staff;

/**
 *
 * @author VAN
 */
public class StaffDao extends AbstractFacade<Staff> implements StaffDaoInterface{
    
    public StaffDao() {
        super(Staff.class);
    }
    
}
