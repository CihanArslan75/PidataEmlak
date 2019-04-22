package com.cihan.estate.utils;

import java.util.Date;
import java.util.List;

/** @author Cihan    */
public interface IDatabase<T> {
    public boolean save(T t) throws Exception ;
    public boolean update(T t) throws Exception  ;
    public boolean delete(T t) throws Exception ;
    public List<T> getAllList(T t)  throws Exception;
    public T findId(int id,T t)  throws Exception;
    public List<T> findAllId(String columnName,int id,T t) throws Exception ;
    public List<T> search(String columnName, String search ,T t)  throws Exception;
    public T searchUsr(String columnName, String search, T t) throws Exception;
    public List<T> searchAll(String columnName, String search ,T t)  throws Exception;
    public List<T> searchIdAll(T t) throws Exception;
    public List<T> search(T t)  throws Exception;
    public List<T> searchDate(String columnName, Date date1,Date date2, T t) throws Exception;   
}