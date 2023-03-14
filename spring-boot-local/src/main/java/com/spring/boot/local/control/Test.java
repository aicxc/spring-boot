package com.spring.boot.local.control;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/test")
	public String test(@RequestBody String str) {
		System.out.println("123");
		return str;
	}


}
