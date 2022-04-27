<<<<<<< HEAD
package ques6.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Ques6.xml");
		Details properties=(Details)context.getBean("details");
		System.out.println(properties.display());
	}

}
=======
package ques6.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Ques6.xml");
		Details properties=(Details)context.getBean("details");
		System.out.println(properties.display());
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
