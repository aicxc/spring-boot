package com.spring.boot.local;

import com.spring.boot.local.control.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLocalApplication {

	public static void main(String[] args) {
		// 测试一下
		ConfigurableApplicationContext context = SpringApplication.run(new Class<?>[]{SpringBootLocalApplication.class, Test.class}, args);
	}

}
