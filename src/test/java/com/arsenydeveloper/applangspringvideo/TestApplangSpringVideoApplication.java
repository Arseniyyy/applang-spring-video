package com.arsenydeveloper.applangspringvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestApplangSpringVideoApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApplangSpringVideoApplication::main).with(TestApplangSpringVideoApplication.class).run(args);
	}

}
