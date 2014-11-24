package org.lzj.bms.persist;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Object, PK extends Serializable> {
	/**
	 * 
	 * 
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * 
	 * 
	 * @param entity
	 */
	public void update(T entity);

	/**
	 *
	 * 
	 * @param k
	 */
	public void deleteById(PK k);

	/**
	 *
	 * 
	 * @param entity
	 */
	public void delete(T entity);
	/**
	 * 
	 * @param k
	 * @return T
	 */
	public T findById(PK k);
	/**
	 * 
	 * @param ids
	 * @return List<T>
	 */
	List<T> getByIds(PK[] ids);

	/**
	 * 
	 * 
	 * @return
	 */
	List<T> findAll();
	
	
	/**
	 * @return int
	 */
	int count();

	/**
	 * 
	 */
	void deleteAll();

	/**
	 * @param id
	 * @return
	 */
	T load(PK id);
	


}
