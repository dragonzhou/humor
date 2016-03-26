package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:aopbeanAop.xml");  
        PersonServiceBean  bean = (PersonServiceBean )ctx.getBean("personServiceBean");  
        bean.save(null);  
	}
}
