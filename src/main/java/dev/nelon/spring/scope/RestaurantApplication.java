package dev.nelon.spring.scope;

import dev.nelon.spring.scope.beans.HeadChef;
import dev.nelon.spring.scope.beans.ObjectProviderDemo;
import dev.nelon.spring.scope.beans.OrderProcessor;
import dev.nelon.spring.scope.beans.Waiter;
import dev.nelon.spring.scope.config.RestaurantConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class RestaurantApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);
		
		// System.out.println(context.getBean(HeadChef.class) == context.getBean(HeadChef.class));
		// System.out.println(context.getBean(Waiter.class) == context.getBean(Waiter.class));
		
		HeadChef firstHeadChef = context.getBean(HeadChef.class);
		HeadChef secondHeadChef = context.getBean(HeadChef.class);
		firstHeadChef.setName("Alex");
		// Берёт из одного контейнера
		System.out.println(firstHeadChef);
		System.out.println(secondHeadChef);
		
		Waiter firstWaiter = context.getBean(Waiter.class, UUID.randomUUID());
		Waiter secondtWaiter = context.getBean(Waiter.class, UUID.randomUUID());
		firstWaiter.setOrder("Coffee");
		System.out.println(firstWaiter);
		System.out.println(secondtWaiter);
		
		// ObjectProvider
		ObjectProviderDemo objectProviderDemo = context.getBean(ObjectProviderDemo.class);
		objectProviderDemo.getAndCompareHeadChef();
		objectProviderDemo.getAndCompareWaiter();
		
		// Practice
		OrderProcessor processor = context.getBean(OrderProcessor.class);
		processor.processOrder("Coffee", 9);
	}
}
