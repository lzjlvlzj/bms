package org.lzj.bms.service.impl;



import org.lzj.bms.entity.Role;
import org.lzj.bms.persist.BaseDao;
import org.lzj.bms.persist.RoleDao;
import org.lzj.bms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements
		RoleService {
	
	@Autowired
	private RoleDao roleDaoImpl;

	@Override
	public BaseDao<Role, Integer> getDao() {
		return roleDaoImpl;
	}


}
