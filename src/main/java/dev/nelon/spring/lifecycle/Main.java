package dev.nelon.spring.lifecycle;

import dev.nelon.spring.lifecycle.beans.CoffeeShop;
import dev.nelon.spring.lifecycle.config.LifecycleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
		
		CoffeeShop shop = context.getBean(CoffeeShop.class);
		shop.makeCoffee();
		
		// Coffee coffee = context.getBean(Coffee.class, "Cappuccino");
		shop.makeCoffee("Latte");
		
		shop.makeCoffee("Latte", "sugar");
		shop.makeCoffee("Latte", "milk");
		shop.makeCoffee("Latte", "non");
		
		context.close();
	}
}
