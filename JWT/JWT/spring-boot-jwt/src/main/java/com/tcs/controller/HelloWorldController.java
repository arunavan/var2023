package com.tcs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	@RequestMapping({ "/validate" })
	public String validate() {
		return "Validation with JWT Token is Success!";
	}
}
