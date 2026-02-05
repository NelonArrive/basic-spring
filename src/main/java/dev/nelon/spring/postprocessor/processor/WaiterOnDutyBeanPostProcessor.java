package dev.nelon.spring.postprocessor.processor;

import dev.nelon.spring.postprocessor.bean.Waiter;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class WaiterOnDutyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Waiter) {
			((Waiter)bean).setOnDuty(false);
		}
		
		return bean;
	}
}
