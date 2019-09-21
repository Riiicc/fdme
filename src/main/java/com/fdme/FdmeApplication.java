package com.fdme;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.fdme.mapper")
public class FdmeApplication {
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	/**
	 * 打印 sql
	 */
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
		//格式化sql语句
		Properties properties = new Properties();
		properties.setProperty("format", "false");
		performanceInterceptor.setProperties(properties);
		return performanceInterceptor;
	}
	public static void main(String[] args) {
		SpringApplication.run(FdmeApplication.class, args);
	}

}
