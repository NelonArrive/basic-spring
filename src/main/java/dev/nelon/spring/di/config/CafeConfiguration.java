package dev.nelon.spring.di.config;

import dev.nelon.spring.di.bean.Kitchen;
import dev.nelon.spring.di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.nelon.spring.di")
public class CafeConfiguration {
	
	@Bean
	public Waiter waiter(Kitchen kitchen) {
		return new Waiter(kitchen);
	}
	
}
