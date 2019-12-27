package com.exam.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Log4j
public class SampleServiceTests {

	@Autowired
	private SampleService service;
	
	@Test
	public void testClass() {
		log.info(service);
		log.info(service.getClass().getName());
	}
	
	@Test
	public void testAdd() throws Exception {
		int actual = service.doAdd("123", "456");
		log.info(actual);
		assertEquals(579, actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testAddError() throws Exception {
		log.info(service.doAdd("123", "ABC"));
		
	}
	
}
