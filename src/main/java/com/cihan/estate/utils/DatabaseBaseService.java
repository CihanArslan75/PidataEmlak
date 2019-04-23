package com.cihan.estate.utils;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.cihan.estate.models.StateEnum;


	/**
	 *
	 * @author Cihan
	 */
	public class DatabaseBaseService<T> implements  IDatabase<T>{
		protected Session ss;
	    private Transaction tt;
	    
	    protected void openSession(){
	        ss=hbUtil.getSessionFactory().openSession();
	        tt= ss.beginTransaction();
	    }
	    
	    protected void closeSession() {
	        tt.commit();
	        ss.close();
	    }
	    
	    private void rollbackSession() {
	        tt.rollback();
	        ss.close();
	    }

	    @Override
	    public boolean save(T t)  throws Exception {
	          openSession();
	          ss.save(t);
	          closeSession();
	          return true;
	  
	    }

	    @Override
	    public boolean update(T t)  throws Exception {
	            openSession();
	            ss.update(t);
	            closeSession();
	            return true;
	       
	      }

	    @Override
	    public boolean delete(T t)  throws Exception {
	            openSession();
	            ss.delete(t);
	            closeSession();
	            return true;
	       
	    }

	    
	    @Override
	    public List<T> getAllList(T t) throws Exception {
	            openSession();
	            Criteria cr=ss.createCriteria(t.getClass());
	            List<T> list = cr.list();
	            closeSession();
	            return list;
	       
	     }

	    @Override
	    public T findId(int id, T t) throws Exception {
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.eq("id",id));
	            T list = (T) cr.uniqueResult();
	            closeSession();
	            return list;
	      
	    }
	    
	    @Override
	    public List<T> findAllId(String columnName,int id, T t) throws Exception {
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.eq(columnName,id));
	            List<T> list =  cr.list();
	            closeSession();
	            return list;
	      
	    }
	    
	    @Override
	    public List<T> search(String columnName, String search, T t) throws Exception  {
	    
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.eq("state",StateEnum.YENIGIRIS));
	            cr.add(Restrictions.ilike(columnName, search));
	            List<T> list = cr.list();
	            closeSession();
	            return list;
	      
	        
	    }
	    
	    @Override
	    public T searchUsr(String columnName, String search, T t) throws Exception  {
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.eq("state",StateEnum.YENIGIRIS));
	            cr.add(Restrictions.ilike(columnName, search));
	            T list = (T) cr.uniqueResult();
	            closeSession();
	            return list;
	      
	        
	    }
	    
	     
	    @Override
	    public List<T> searchAll(String columnName, String search, T t) throws Exception  {
	       
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.ilike(columnName, "'%"+search+"%'"));
	            cr.addOrder(Order.desc("id"));
	            List<T> list = cr.list();
	            closeSession();
	            return list;
	       
	    }
	    
	    @Override
	    public List<T> searchEstate(String columnName1, String columnName2, Long price1,Long price2, T t) throws Exception  {
	       
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            if(!columnName1.equals("")) cr.add(Restrictions.eq("estateType",columnName1));
	            if(!columnName2.equals("")) cr.add(Restrictions.eq("estateState",columnName2));
	            if(price1!=null && price2==null) cr.add(Restrictions.eq("price",price1));
	            if(price1==null && price2!=null) cr.add(Restrictions.eq("price",price2));
	            if(price1!=null && price2!=null) cr.add(Restrictions.between("price", price1,price1));
	            cr.addOrder(Order.desc("id"));
	            List<T> list = cr.list();
	            closeSession();
	            return list;
	       
	    }

	    @Override
	    public List<T> searchIdAll(T t)   throws Exception{

	        List<T> list=null;
	        
	        Class cl = t.getClass();
	        Field[] fl = cl.getDeclaredFields();
	        
	      
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            for (int i = 0; i < fl.length; i++) {
	                fl[i].setAccessible(true);
	                if(fl[i].get(t)!=null && !fl[i].get(t).toString().equals("0") ){
	                	cr.add(Restrictions.eq(fl[i].getName(), fl[i].get(t))); 
	                }
	            }
	            
	            list = cr.list();
	            closeSession();
	            return list;
	       
	        
	    }

	    @Override
	    public List<T> search(T t) throws Exception {
	       
	        List<T> list=null;
	        
	        Class cl = t.getClass();
	        Field[] fl = cl.getDeclaredFields();
	        
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            for (int i = 0; i < fl.length; i++) {
	                fl[i].setAccessible(true);
	                if(fl[i].get(t)!=null && !fl[i].get(t).toString().equals("0") ){
	                	if(fl[i].getName().equals("state")) cr.add(Restrictions.eq(fl[i].getName(),fl[i].get(t)));   // durum 2 delete , 1 normal kayıt
	                    else cr.add(Restrictions.ilike(fl[i].getName(), "%"+fl[i].get(t)+"%")); 
	                }
	            }
	            cr.addOrder(Order.desc("id"));
	            list = cr.list();
	            closeSession();
	            return list;
	        
	    }
	    
	    
	    @Override
	    public List<T> searchDate(String columnName, Date date1,Date date2, T t)  throws Exception {
	       
	            openSession();
	            Criteria cr = ss.createCriteria(t.getClass());
	            cr.add(Restrictions.between(columnName, date1,date2));
	            cr.addOrder(Order.desc("id"));
	            List<T> list = cr.list();
	            closeSession();
	            return list;
	      
	        
	    }
	    
	}	    