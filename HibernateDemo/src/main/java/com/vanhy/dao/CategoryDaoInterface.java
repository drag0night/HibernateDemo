/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Category;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface CategoryDaoInterface {
    
    List<Category> findAll();
    
    Category find(int id);
    
    void create(Category entity);
    
    void edit(Category entity);
    
    void remove(Category entity);
    
}
