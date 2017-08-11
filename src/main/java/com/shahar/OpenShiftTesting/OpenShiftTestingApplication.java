package com.shahar.OpenShiftTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shahar.OpenShiftTesting.model.FullNameRequest;
import com.shahar.OpenShiftTesting.model.FullNameResponse;

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
	
	@RequestMapping(method=RequestMethod.POST, path="/createFullName")
	@ResponseBody
	public FullNameResponse createFullName(@RequestBody FullNameRequest req) {
		FullNameResponse resp = new FullNameResponse();
		resp.setFullName(req.getFirstName() + " " + req.getLastName());
		return resp;
	}
}
