<<<<<<< HEAD
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
=======
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
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
