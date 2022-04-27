package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("deprecation")
@Configuration
public class Circle implements ApplicationContextAware {
	point center;

	@Required

	public void setCenter(point center) {
		this.center = center;
	}

	public point getCenter() {
		return center;
	}

	void draw() {
		System.out.println("Drawing Circle at point : " + getCenter().getX() + "," + getCenter().getY());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

}
