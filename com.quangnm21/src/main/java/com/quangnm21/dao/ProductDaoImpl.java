package com.quangnm21.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Product;

@Repository
@Transactional
public class ProductDaoImpl implements IProductDao {

    public Logger logger = Logger.getLogger(ProductDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<Product> getAllProduct() {
        List<Product> products = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            transaction.setTimeout(5);

            products = session.createCriteria(Product.class).list();

            transaction.commit();
        } catch (RuntimeException re) {
            try {
                transaction.rollback();
            } catch (RuntimeException e) {
                logger.error("Couldn't roll back transaction", e);
            }
            throw re;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return products;
    }

}
