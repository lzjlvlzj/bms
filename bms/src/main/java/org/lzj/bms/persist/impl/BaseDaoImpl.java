package org.lzj.bms.persist.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.lzj.bms.persist.BaseDao;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T extends Object, PK extends Serializable> implements BaseDao<T, PK>{
	@Resource
	private SessionFactory sessionFactory;
	
	private Class<T> clazz;
	
	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); 
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; //
		System.out.println("clazz ---> " + clazz);
	}
	
	/**
	 * 取得session
	 * 
	 * @return Session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public void save(T entity) {
		getSession().save(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void deleteById(PK k) {
		T t = findById(k);
		if(t != null){
			getSession().delete(t);
		}
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public T findById(PK k) {
		if(null == k){
			return null;
		}
		T t = (T)getSession().get(clazz, k);
		return t;
	}

	public List<T> getByIds(PK[] ids) {
		Query q = getSession().createQuery("FROM "+ clazz.getName() +" WHERE id IN (:ids)");
		q.setParameterList("ids", ids);
		List<T> list = q.list();
		return list;
	}

	public List<T> findAll() {
		Query q = getSession().createQuery("FROM " + clazz.getSimpleName());
		List<T> list = q.list();
		return list;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public T load(PK id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
