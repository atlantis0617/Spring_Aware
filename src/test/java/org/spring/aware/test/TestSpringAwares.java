package org.spring.aware.test;

import org.junit.Test;

public class TestSpringAwares extends TestBase{
	
	/**
     * 通过构造器传入spring配置文件路径
     */
    public TestSpringAwares() {
         
        super("classpath:spring-awares.xml");
 
    }
    
    @Test
    public void testApplicationContext() {
         
        System.out.println("testApplicationContext:" + super.getBean("myApplicationContext"));
         
    }
    
    
    @Test
    public void testBeanName() {
         
        System.out.println("testBeanName:" + super.getBean("myBeanName"));
         
    }
     
    @Test
    public void testAware() {
         
        System.out.println("testAware:" + super.getBean("myAware"));
         
    }

}
