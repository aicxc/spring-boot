package com.spring.boot.local;

import com.spring.boot.local.control.Test;
import com.spring.boot.local.initializer.MyApplicationContextInitializerImportByMainMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLocalApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringBootLocalApplication.class, args);

		SpringApplication springApplication = new SpringApplication(SpringBootLocalApplication.class, Test.class);
		springApplication.addInitializers(new MyApplicationContextInitializerImportByMainMethod());
		ConfigurableApplicationContext context = springApplication.run(args);
		System.out.println(context.isActive());

	}

}
