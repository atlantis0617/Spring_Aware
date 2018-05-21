package org.spring.aware.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class TestBase {
	
	private ClassPathXmlApplicationContext context;
    private String springXmlPath;
    
    /**
     * 无参构造器，若无此构造器则必须传入spring配置文件的路径，有此构造器可以设置默认值
     */
    public TestBase() {
         
    }
    
    /**
     * 含参构造器，初始化spring配置文件的位置
     *
     * @param springXmlPath
     */
    public TestBase(String springXmlPath) {
         
        this.springXmlPath = springXmlPath;
         
    }
    
    /**
     * 初始化加载spring配置文件，在@Test注解的方法执行之前执行
     */
    @Before
    public void begin() {
         
        if(StringUtils.isEmpty(springXmlPath)) {//使用默认的spring配置文件
            springXmlPath = "classpath:spring-*.xml";
        }
        //加载配置文件至spring容器中
        context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        //启动容器并将启动信号扩散至该容器中的所有组件
        context.start();
         
    }
    
    /**
     * 销毁spring容器,在@Test注解的方法执行之后执行
     */
    @After
    public void destroy() {
         
        context.destroy();
         
    }
    
    /**
     * 根据beanID获取bean对象
     *
     * @param beanId
     *                  beanId
     * @return
     */
    public Object getBean(String beanId) {
         
        return context.getBean(beanId);
         
    }

}
