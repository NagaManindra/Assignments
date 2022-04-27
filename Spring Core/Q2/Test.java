<<<<<<< HEAD
package ques2.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ques2.xml");
		Question question = (Question) context.getBean("question");
		System.out.println(question.Display());
	}

}
=======
package ques2.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ques2.xml");
		Question question = (Question) context.getBean("question");
		System.out.println(question.Display());
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
