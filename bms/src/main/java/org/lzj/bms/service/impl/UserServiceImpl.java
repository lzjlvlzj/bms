package org.lzj.bms.service.impl;


import org.lzj.bms.entity.User;
import org.lzj.bms.persist.BaseDao;
import org.lzj.bms.persist.UserDao;
import org.lzj.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements
		UserService {
	
	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public BaseDao<User, Integer> getDao() {
		return userDaoImpl;
	}


}
