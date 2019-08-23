package com.fdme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fdme.dao")
public class FdmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FdmeApplication.class, args);
	}

}
