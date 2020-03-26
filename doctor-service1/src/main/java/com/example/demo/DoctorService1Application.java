package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorService1Application {

	@GetMapping("/getDS")
	public String pgetDoctorService() {
		return "Doctor microservice called....";
	}
	
	@GetMapping("/welcome/{name}")
	public String wise(@PathVariable String name) {
		return "hi "+ name +" welcome to Doctor service.";
	}
	public static void main(String[] args) {
		SpringApplication.run(DoctorService1Application.class, args);
	}

}
