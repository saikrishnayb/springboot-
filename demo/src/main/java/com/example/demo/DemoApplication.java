package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
@SpringBootApplication
public class DemoApplication {
	@GetMapping(value="/get")
	public String helloWorld()
	{
		return "hello";
	
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		

}
