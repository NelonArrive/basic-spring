package dev.nelon.spring.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dev.nelon.spring.application")
@PropertySource("classpath:tasks-application.properties")
public class ApplicationConfig {
}
