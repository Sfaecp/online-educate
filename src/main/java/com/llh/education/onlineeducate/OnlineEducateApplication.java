package com.llh.education.onlineeducate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.llh.education.onlineeducate.mapper")
public class OnlineEducateApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEducateApplication.class, args);
	}

}
