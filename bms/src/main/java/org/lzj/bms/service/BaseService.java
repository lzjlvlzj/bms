package org.lzj.bms.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService <T extends Object, PK extends Serializable>{
	
	/**
	 * @param id
	 * @return
	 */
	public T load(PK id);
	 
    /**
     * @param t
     */
    public void update(T t);
 
    /**
     * @param t
     */
    public void save(T t);
 
    /**
     * @param t
     */
    public void delete(T t);
 
    /**
     * @return
     */
    public List<T> getList();
 
    /**
     * @param id
     */
    public void deleteById(PK id);
 
    /**
     * 
     */
    public void deleteAll();
 
    /**
     * @return
     */
    public int count();
	
}
