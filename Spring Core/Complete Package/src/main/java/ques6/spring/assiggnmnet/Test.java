package ques6.spring.assiggnmnet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Ques6.xml");
		Details properties = (Details) context.getBean("details");
		System.out.println(properties.display());
		context.close();
	}

}
