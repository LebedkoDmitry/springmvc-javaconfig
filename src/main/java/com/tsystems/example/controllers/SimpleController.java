package com.tsystems.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.example.service.SimpleService;

@RestController
@RequestMapping(path = "/api/messages")
public class SimpleController {
	
	public SimpleService simpleService;
	
	public SimpleController(SimpleService simpleService) {
		this.simpleService = simpleService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getMessage() {
		return "message";
	}

}
