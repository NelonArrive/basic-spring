package dev.nelon.spring.proxy;

import dev.nelon.spring.proxy.bean.Customer;
import dev.nelon.spring.proxy.bean.IWaiter;
import dev.nelon.spring.proxy.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		IWaiter john = context.getBean("john", IWaiter.class);
		Customer andrew = context.getBean("andrew", Customer.class);
		Customer julia = context.getBean("julia", Customer.class);
		Customer nina = context.getBean("nina", Customer.class);
		
		for (int i = 0; i < 3; i++) {
			new Thread(() -> andrew.placeOrder(john)).start();
			new Thread(() -> julia.placeOrder(john)).start();
			new Thread(() -> nina.placeOrder(john)).start();
		}
	}
}
