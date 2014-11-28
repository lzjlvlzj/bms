package org.lzj.bms.service.impl;


import org.lzj.bms.entity.Demo;
import org.lzj.bms.persist.BaseDao;
import org.lzj.bms.persist.DemoDao;
import org.lzj.bms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemoServiceImpl extends BaseServiceImpl<Demo, Integer> implements
		DemoService {
	
	@Autowired
	private DemoDao demoDaoImpl;
	
	@Override
	public BaseDao<Demo, Integer> getDao() {
		return demoDaoImpl;
	}
	

}
