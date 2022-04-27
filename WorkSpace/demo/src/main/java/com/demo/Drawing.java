package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] arg) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle = (Circle) context.getBean("circle");
		context.registerShutdownHook();
		circle.draw();
		context.close();

	}

}
