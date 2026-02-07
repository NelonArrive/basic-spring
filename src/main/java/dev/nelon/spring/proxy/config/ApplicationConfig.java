package dev.nelon.spring.proxy.config;

import dev.nelon.spring.proxy.bean.Customer;
import dev.nelon.spring.proxy.bean.IWaiter;
import dev.nelon.spring.proxy.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.nelon.spring.proxy")
public class ApplicationConfig {
	
	@Bean
	public IWaiter john() {
		return new Waiter("John");
	}
	
	@Bean
	public Customer andrew() {
		return new Customer("Andrew");
	}
	
	@Bean
	public Customer julia() {
		return new Customer("Julia");
	}
	
	@Bean
	public Customer nina() {
		return new Customer("Nina");
	}
}
