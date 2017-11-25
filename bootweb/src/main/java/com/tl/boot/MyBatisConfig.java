package com.tl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tl.boot.**.dao")
public class MyBatisConfig {

	// @Autowired
	// private DataSource dataSource;
	//
	// @Bean
	// public SqlSessionFactory sqlSessionFactory() {
	// SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	// bean.setDataSource(dataSource);
	// ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	// try {
	// bean.setMapperLocations(resolver.getResources("classpath:com/tl/boot/**/dao/*.xml"));
	// return bean.getObject();
	// } catch (IOException e) {
	// } catch (Exception e) {
	// }
	// return null;
	// }
	//
	// @Bean
	// public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory
	// sqlSessionFactory) {
	// return new SqlSessionTemplate(sqlSessionFactory);
	// }

	// @Bean
	// public MapperScannerConfigurer mapperScannerConfigurer() {
	// MapperScannerConfigurer mapperScannerConfigurer = new
	// MapperScannerConfigurer();
	// mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	// mapperScannerConfigurer.setBasePackage("com.tl.boot.base.dao");
	// return mapperScannerConfigurer;
	// }
}
