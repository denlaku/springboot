package com.denlaku.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.denlaku.boot.**.dao")
public class MyBatisConfig {
}
