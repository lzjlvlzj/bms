package org.lzj.bms.service.impl;

import java.io.Serializable;
import java.util.List;



import org.lzj.bms.persist.BaseDao;
import org.lzj.bms.service.BaseService;

public abstract class BaseServiceImpl<T extends Object, PK extends Serializable>
		implements BaseService<T, PK> {
	
	public T findById(PK id) {
		return getDao().findById(id);
	}

	public abstract BaseDao<T, PK> getDao();

	public int count() {
		return getDao().count();
	}

	public void delete(T t) {
		getDao().delete(t);
	}

	public void deleteAll() {
		getDao().deleteAll();
	}

	public void deleteById(PK id) {
		getDao().deleteById(id);
	}

	public List<T> getList() {
		return getDao().findAll();
	}

	public T load(PK id) {
		return getDao().load(id);
	}

	public void save(T t) {
		getDao().save(t);
	}

	public void update(T t) {
		getDao().update(t);
	}

}
