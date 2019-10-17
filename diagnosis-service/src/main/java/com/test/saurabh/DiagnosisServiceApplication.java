package com.test.saurabh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class DiagnosisServiceApplication {

	@GetMapping("/diagnosis")
	public String getDiagnosis()
	{
		return "cold-cough";
	}
	
	@GetMapping("/diagnosis/{level}")
	public String getDiagnosisLevel(@PathVariable("level") String level)
	{
		return "you have "+ level+"fever";
	}
	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);
	}

}
