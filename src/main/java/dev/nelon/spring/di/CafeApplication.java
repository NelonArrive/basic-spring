package dev.nelon.spring.di;

import dev.nelon.spring.di.bean.Customer;
import dev.nelon.spring.di.config.CafeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CafeApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CafeConfiguration.class);
		Customer customer = context.getBean("customer", Customer.class);
		customer.makeOrder("Salad and Pasta");
	}
}
