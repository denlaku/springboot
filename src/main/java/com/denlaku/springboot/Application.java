package com.denlaku.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.denlaku.springboot.processors.MyBeanDefinitionRegistry;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyBeanDefinitionRegistry bean = ctx.getBean(com.denlaku.springboot.processors.MyBeanDefinitionRegistry.class);
		System.out.println(bean);
	}

}
