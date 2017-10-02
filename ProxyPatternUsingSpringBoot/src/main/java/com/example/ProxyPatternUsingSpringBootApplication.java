package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProxyPatternUsingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProxyPatternUsingSpringBootApplication.class, args);
		TestBean bean = ctx.getBean(TestBean.class);
		bean.testProxy();
	}
}
