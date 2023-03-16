package com.spring.boot.local.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author aicxc
 */
public class MyApplicationContextInitializerImportByMainMethod implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("------------------"
				+ applicationContext.getApplicationName()
				+ "MyApplicationContextInitializerImportByMainMethod starting"
				+ "------------------");
	}

	@Override
	public int getOrder() {
		return 2;
	}
}
