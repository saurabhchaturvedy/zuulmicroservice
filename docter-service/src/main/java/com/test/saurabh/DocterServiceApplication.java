package com.test.saurabh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class DocterServiceApplication {

	@GetMapping("/doctor")
	public String getDoctor()
	{
		return "getting docter mr. suneel nath sharma";
	}
	public static void main(String[] args) {
		SpringApplication.run(DocterServiceApplication.class, args);
	}

}
