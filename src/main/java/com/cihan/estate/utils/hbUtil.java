package com.cihan.estate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/** @author Cihan    */
@SuppressWarnings("deprecation")
public class hbUtil {
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
     public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}