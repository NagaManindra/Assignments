package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class postPrefernce implements BeanPostProcessor, InitializingBean {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName);
		return bean;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

}
