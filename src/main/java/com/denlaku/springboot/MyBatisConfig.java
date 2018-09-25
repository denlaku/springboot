package com.denlaku.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.denlaku.springboot.dao")
public class MyBatisConfig {
}
