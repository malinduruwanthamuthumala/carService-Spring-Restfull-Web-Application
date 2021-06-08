package com.spring.restfull.carservice.carservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Good Morning");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorld helloWorldBean(@PathVariable String name) {
		return new HelloWorld("Good Morning" + " "+ name);
	}
}
