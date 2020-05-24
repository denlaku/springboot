package com.denlaku.springboot.processors;

import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryConfig {

	private String name = "MyBeanDefinitionRegistry";
	private String className = "com.denlaku.springboot.processors.MyBeanDefinitionRegistry";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
