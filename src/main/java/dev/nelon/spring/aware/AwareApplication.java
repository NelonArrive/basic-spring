package dev.nelon.spring.aware;

import dev.nelon.spring.aware.config.AwareConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
	}
}
