package org.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyApplicationContext  implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		System.out.println("MyApplicationContext:" + context.getBean("myApplicationContext"));
		
	}

}
