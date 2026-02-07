package dev.nelon.spring.application.event;

import org.springframework.context.ApplicationEvent;

public class SaveTaskEvent extends ApplicationEvent {
	public SaveTaskEvent(Object source) {
		super(source);
	}
}