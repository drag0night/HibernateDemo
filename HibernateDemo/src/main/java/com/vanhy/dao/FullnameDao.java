/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Fullname;

/**
 *
 * @author VAN
 */
public class FullnameDao extends AbstractFacade<Fullname> implements FullnameDaoInterface{
    
    public FullnameDao() {
        super(Fullname.class);
    }
    
}
