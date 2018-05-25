/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanhy.dao;

import com.vanhy.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author VAN
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public List<T> findAll() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            return session.createCriteria(entityClass).list();
        } catch (Exception e) {
            throw e;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public T find(int id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            return (T) session.get(entityClass, id);
        } catch (Exception e) {
            throw e;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public void create(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction trx = session.getTransaction();
            trx.begin();
            session.save(entity);
            trx.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public void edit(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction trx = session.getTransaction();
            trx.begin();
            session.update(entity);
            trx.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public void remove(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction trx = session.getTransaction();
            trx.begin();
            session.delete(entity);
            trx.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            HibernateUtil.closeSession();
        }
    }
}
