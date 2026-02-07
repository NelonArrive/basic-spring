package dev.nelon.spring.profile.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("latte")
// @Primary
public class Latte implements Coffee {
	@Override
	public String brew() {
		return "Latte";
	}
}