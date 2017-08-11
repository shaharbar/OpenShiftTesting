package com.shahar.OpenShiftTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenShiftTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftTestingApplication.class, args);
	}
	
	@RequestMapping(path="/hello")
	public String hello(@RequestParam(defaultValue="Shahar") String name) {
		return "Hello " + name + "!";
	}
}
