/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Account;
import java.util.List;

/**
 *
 * @author VAN
 */
public interface AccountDaoInterface {
    
    List<Account> findAll();
    
    Account find(int id);
    
    void create(Account entity);
    
    void edit(Account entity);
    
    void remove(Account entity);
    
    Account checkLogin(Account entity);
    
    boolean checkUsername(String username);
}
