package org.lzj.bms.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzj.bms.entity.Role;
import org.lzj.bms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class RoleServiceImplTest {
	
	@Autowired
	private RoleService roleServiceImpl;
	
	@Test
	public void testFindById(){
		int id = 1;
		Role role = roleServiceImpl.findById(id);
		System.out.println(role);
		
	}
	@Test
	public void testCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetList() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoad() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		Role role = new Role();
		role.setRoleName("超級管理員");
		role.setRoleValue("ROLE_ADMIN");
		role.setCreateTime(new Date());
		
		roleServiceImpl.save(role);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
