package com.denlaku.springboot.initializers;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		log.info("log>>>>>>>>>>>>>>>>>>>>>>: MyInitializers.initialize()");
		System.out.println("MyInitializers.initialize()");
	}

}
