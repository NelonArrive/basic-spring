package dev.nelon.spring.lifecycle.config;

import dev.nelon.spring.lifecycle.beans.IngredientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.nelon.spring.lifecycle")
public class LifecycleConfiguration {
	
//	@Bean(initMethod = "openShop", destroyMethod = "closeShop")
//	public CoffeeShop coffeeShop() {
//		return new CoffeeShop();
//	}
	
	@Bean
	public IngredientFactoryBean sugar() {
		return new IngredientFactoryBean("sugar");
	}
	
	@Bean
	public IngredientFactoryBean milk() {
		return new IngredientFactoryBean("milk");
	}
	
}
