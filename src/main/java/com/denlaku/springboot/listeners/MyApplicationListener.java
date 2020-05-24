package com.denlaku.springboot.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

	private int count;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("MyApplicationListener.onApplicationEvent()");
		System.out.println("=========> " + (++count) + ": " + event.getClass());
	}

}
