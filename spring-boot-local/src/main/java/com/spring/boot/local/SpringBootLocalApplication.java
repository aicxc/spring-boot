package com.spring.boot.local;

import com.spring.boot.local.control.Test;
import com.spring.boot.local.initializer.MyApplicationContextInitializerImportByMainMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@SpringBootApplication
public class SpringBootLocalApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringBootLocalApplication.class, args);

		SpringApplication springApplication = new SpringApplication(SpringBootLocalApplication.class, Test.class);
		springApplication.addInitializers(new MyApplicationContextInitializerImportByMainMethod());


		System.out.println("initializers--------------------------------------------");
		Set<ApplicationContextInitializer<?>> initializers = springApplication.getInitializers();
		initializers.forEach((var) -> System.out.println(var.getClass()));

		System.out.println("listeners-----------------------------------------------");
		Set<ApplicationListener<?>> listeners = springApplication.getListeners();
		listeners.forEach((var) -> System.out.println(var.getClass()));

		ConfigurableApplicationContext context = springApplication.run(args);
		System.out.println(context.isActive());

	}

}
