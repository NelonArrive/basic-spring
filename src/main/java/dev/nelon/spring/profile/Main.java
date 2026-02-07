package dev.nelon.spring.profile;

import dev.nelon.spring.profile.bean.CoffeeShop;
import dev.nelon.spring.profile.bean.Holder;
import dev.nelon.spring.profile.bean.LazyBean;
import dev.nelon.spring.profile.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		CoffeeShop coffeeShop = context.getBean(CoffeeShop.class);
		coffeeShop.orderCoffee();
		coffeeShop.printShopName();
		
		Holder holder = context.getBean(Holder.class);
		holder.fireLazyBean();
		
		LazyBean lazyBean = context.getBean(LazyBean.class);
		lazyBean.fireHolderBean();
	}
}
