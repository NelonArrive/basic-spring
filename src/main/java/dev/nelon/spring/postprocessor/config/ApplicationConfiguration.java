package dev.nelon.spring.postprocessor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
@ComponentScan("dev.nelon.spring.postprocessor")
public class ApplicationConfiguration {
	@Bean
	public LocalTime openTime() {
		return LocalTime.of(9, 0);
	}
}
