/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Person;

/**
 *
 * @author VAN
 */
public class PersonDao extends AbstractFacade<Person> implements PersonDaoInterface{
    
    public PersonDao() {
        super(Person.class);
    }
    
}
