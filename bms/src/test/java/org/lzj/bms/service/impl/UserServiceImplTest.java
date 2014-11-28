package org.lzj.bms.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzj.bms.entity.User;
import org.lzj.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserServiceImplTest {
	
	@Autowired
	private UserService userServiceImpl;
	
	@Test
	public void testGetDao() {
		fail("Not yet implemented");
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
		User user = new User();
		user.setLoginName("admin");
		user.setRealName("管理员");
		Date birthDay = new Date();
		user.setBirthDay(birthDay);
		Date createTime = new Date();
		user.setCreateDate(createTime);
		user.setSex(1);
		
		userServiceImpl.save(user);
		
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
