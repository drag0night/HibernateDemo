/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Person;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface PersonDaoInterface {
    
    List<Person> findAll();
    
    Person find(int id);
    
    void create(Person entity);
    
    void edit(Person entity);
    
    void remove(Person entity);
    
}
