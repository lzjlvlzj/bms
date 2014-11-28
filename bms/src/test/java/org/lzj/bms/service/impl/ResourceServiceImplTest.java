package org.lzj.bms.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzj.bms.entity.Resource;
import org.lzj.bms.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ResourceServiceImplTest {
	
	@Autowired
	private ResourceService resourceServiceImpl;

	@Test
	public void testFindById() {
		int id = 1;
		Resource res = resourceServiceImpl.findById(id);
		System.out.println(res);
	}

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
		Resource res = new Resource();
		res.setCreateDate(new Date());
		res.setResourceName("首页");
		res.setResourceUri("index.jsp");
		
		resourceServiceImpl.save(res);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
