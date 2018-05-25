/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Publisher;

/**
 *
 * @author VAN
 */
public class PublisherDao extends AbstractFacade<Publisher> implements PublisherDaoInterface{
    
    public PublisherDao() {
        super(Publisher.class);
    }
    
}
