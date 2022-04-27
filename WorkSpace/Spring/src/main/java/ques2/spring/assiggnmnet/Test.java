package ques2.spring.assiggnmnet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Ques2.xml");
		Question question = (Question) context.getBean("question");
		System.out.println(question.Display());
		context.close();
	}

}
