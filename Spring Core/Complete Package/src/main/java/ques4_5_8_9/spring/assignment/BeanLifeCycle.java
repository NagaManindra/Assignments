<<<<<<< HEAD
package ques4_5_8_9.spring.assignment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifeCycle implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" Before Initialization");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" After Initialization\n");
		return bean;
	}

}
=======
package ques4_5_8_9.spring.assignment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifeCycle implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" Before Initialization");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" After Initialization\n");
		return bean;
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
