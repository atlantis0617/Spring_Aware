package org.spring.aware.test;

import org.junit.Test;

public class TestSpringAware extends TestBase {

	/**
	 * 通过构造器传入spring配置文件路径
	 */
	public TestSpringAware() {

		super("classpath:spring-aware.xml");

	}

	@Test
	public void testApplicationContext() {

		System.out.println("testApplicationContext:" + super.getBean("myApplicationContext"));

	}

	@Test
	public void testBeanName() {

		System.out.println("testBeanName:" + super.getBean("myBeanName"));

	}

}
