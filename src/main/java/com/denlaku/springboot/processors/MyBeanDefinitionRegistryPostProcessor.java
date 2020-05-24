package com.denlaku.springboot.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClassName("com.denlaku.springboot.processors.MyBeanDefinitionRegistry");
		beanDefinition.setBeanClassName("#{myBeanDefinitionRegistryConfig.className}");
		beanDefinition.getPropertyValues().add("name", "#{myBeanDefinitionRegistryConfig.name}");
//		beanDefinition.setAttribute("name", "#{MyBeanDefinitionRegistryConfig.name}");
		registry.registerBeanDefinition("myBeanDefinitionRegistry", beanDefinition);
	}

}
