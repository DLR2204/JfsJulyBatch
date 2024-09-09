package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("demo")
@Configuration
public class Test {
	
	public static void main(String[] args) {
		
//		BeanFactory factory = new AnnotationConfigApplicationContext(Test.class);
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
		
		System.out.println(factory.getBean("emp"));
		
		System.out.println(factory.getBean("add"));
		
	}

}
