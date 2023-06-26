package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String str = "<br/><br/><center><h1>Greetings from Spring Boot + Tanzu!</h1></center><br/><br/><br/>"
				+ "<img src='https://spring.io/img/spring-2.svg' />";
		return str;
	}

}
