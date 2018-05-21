package org.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyAware  implements ApplicationContextAware, BeanNameAware {
	
	 private String name;

	@Override
	public void setBeanName(String name) {
		
		this.name = name;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		System.out.println("MyAware:" + context.getBean(name));
		
	}

}
