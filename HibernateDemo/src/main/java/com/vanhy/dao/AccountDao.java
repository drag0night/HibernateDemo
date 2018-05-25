/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.entity.Account;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author VAN
 */
public class AccountDao extends AbstractFacade<Account> implements AccountDaoInterface {

    public AccountDao() {
        super(Account.class);
    }

    @Override
    public Account checkLogin(Account entity) {
        List<Account> accounts = findAll();
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getUsername().equals(entity.getUsername()) && account.getPassword().equals(entity.getPassword())) {
                    return account;
                }
            }
        }
        return null;
    }

    @Override
    public boolean checkUsername(String username) {
        List<Account> accounts = findAll();
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

}
