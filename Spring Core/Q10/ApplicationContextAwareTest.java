<<<<<<< HEAD
package ques10.spring.assiggnmnet;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextAwareTest implements ApplicationContextAware {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}
}
=======
package ques10.spring.assiggnmnet;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextAwareTest implements ApplicationContextAware {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
