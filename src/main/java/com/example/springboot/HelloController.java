package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String str = "Greetings from Spring Boot + Tanzu! Welcome!!!";
		return str;
	}

	@GetMapping("/test")
	public String getParamByName(@RequestParam String name){
		return "getParamByName.Input Name: " + name;
	}

	@GetMapping("/test/{name}")
	public String getRestParamByName(@PathVariable("name") String name){
		return "getRestParamByName.Input Name: " + name;
	}

}
