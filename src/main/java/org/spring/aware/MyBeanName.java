package org.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanName implements BeanNameAware{

	@Override
	public void setBeanName(String name) {
		
		 System.out.println("MyBeanName:" + name);
		
	}

}
