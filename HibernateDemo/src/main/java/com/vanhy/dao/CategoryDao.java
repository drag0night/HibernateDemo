/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Category;

/**
 *
 * @author VAN
 */
public class CategoryDao extends AbstractFacade<Category> implements CategoryDaoInterface{
    
    public CategoryDao() {
        super(Category.class);
    }
    
}
