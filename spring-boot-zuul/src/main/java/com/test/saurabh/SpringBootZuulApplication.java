package com.test.saurabh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApplication.class, args);
	}

}
