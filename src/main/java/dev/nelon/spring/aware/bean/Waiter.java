package dev.nelon.spring.aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Waiter implements ApplicationContextAware, BeanFactoryAware {
	
	private ApplicationContext applicationContext;
	private BeanFactory beanFactory;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void takeOrder(String dish) {
		System.out.println("Waiter takes order");
		// applicationContext.getBean(Chef.class).cook(dish);
		beanFactory.getBean(Chef.class).cook(dish);
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
