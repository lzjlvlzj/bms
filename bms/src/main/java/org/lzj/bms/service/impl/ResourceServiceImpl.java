package org.lzj.bms.service.impl;

import org.lzj.bms.entity.Resource;
import org.lzj.bms.persist.BaseDao;
import org.lzj.bms.persist.ResourceDao;
import org.lzj.bms.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl extends BaseServiceImpl<Resource, Integer> implements
		ResourceService {
	@Autowired
	private ResourceDao resourceDaoImpl;

	@Override
	public BaseDao<Resource, Integer> getDao() {
		return resourceDaoImpl;
	}

}
