package com.denlaku.springboot.processors;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class MyBeanDefinitionRegistry {

	private String name;

	@Value("${myConfig.my-bean-definition-registry-class}")
	private String clsName;

}
