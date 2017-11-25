package com.tl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tl.boot.**.dao")
public class MyBatisConfig {
}
