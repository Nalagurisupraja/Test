package com.cg.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
	
	@GetMapping(value = "/show")
	String demoMessage() {
		System.out.println("This is rest api call");
		return "This is rest api call";
	}
	
	
	@PostMapping(value = "/save")
	String demoMessagePost() {
		System.out.println("This is rest api call");
		System.out.println("hi");
		return "This is rest api call for post";
	}
	
	
	
	
	@PutMapping(value = "/delete")
	String demoMessagePut() {
		System.out.println("This is rest api call");
		return "This is rest api call for delete";
	}
	
	
}
