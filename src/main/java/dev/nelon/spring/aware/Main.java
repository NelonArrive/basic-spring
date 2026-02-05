package dev.nelon.spring.aware;

import dev.nelon.spring.aware.bean.Waiter;
import dev.nelon.spring.aware.config.AwareConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
		
		Waiter waiter = context.getBean(Waiter.class);
		waiter.takeOrder("Salad");
	}
}
