package com.denlaku.springboot.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.denlaku.springboot.Desc;
import com.denlaku.springboot.Path;

@Component
@Aspect
public class ControllerAspect {

	@Around("@annotation(path) && @annotation(desc)")
	public Object doAround(ProceedingJoinPoint pjp, Path path, Desc desc) throws Throwable {
		return pjp.proceed(pjp.getArgs());
	}
	
}
