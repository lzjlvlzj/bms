package org.lzj.bms.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lzj.bms.entity.Demo;
import org.lzj.bms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class DemoServiceImplTest {
	
	@Autowired
	private DemoService demoServiceImpl;

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		Demo demo  = new Demo();
		demo.setName("test");
		Date date = new Date();
		demo.setCreateTime(date);
		demoServiceImpl.save(demo);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
