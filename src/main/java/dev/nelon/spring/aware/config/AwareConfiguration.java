package dev.nelon.spring.aware.config;

import dev.nelon.spring.aware.bean.Chef;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.nelon.spring.aware")
public class AwareConfiguration {
	
	@Bean
	public Chef restatuuntChef() {
		return new Chef();
	}
	
}
