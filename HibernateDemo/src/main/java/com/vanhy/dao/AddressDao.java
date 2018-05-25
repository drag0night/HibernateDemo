/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Address;

/**
 *
 * @author VAN
 */
public class AddressDao extends AbstractFacade<Address> implements AddressDaoInterface{
    
    public AddressDao() {
        super(Address.class);
    }
    
}
