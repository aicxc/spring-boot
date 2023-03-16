package com.spring.boot.local.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author aicxc
 */
public class MyApplicationContextInitializerImportByFactories implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("------------------"
				+ applicationContext.getApplicationName()
				+ "MyApplicationContextInitializerImportByFactories  starting"
				+ "------------------");
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
