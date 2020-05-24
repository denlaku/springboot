package com.denlaku.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myConfig")
public class MyConfigProperties {

	private String myBeanDefinitionRegistryClass;

	public String getMyBeanDefinitionRegistryClass() {
		return myBeanDefinitionRegistryClass;
	}

	public void setMyBeanDefinitionRegistryClass(String myBeanDefinitionRegistryClass) {
		this.myBeanDefinitionRegistryClass = myBeanDefinitionRegistryClass;
	}

}
