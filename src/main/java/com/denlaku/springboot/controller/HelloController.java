package com.denlaku.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denlaku.springboot.Desc;
import com.denlaku.springboot.Path;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/index")
	@Path("path11")
	@Desc("desc11")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Greetings from Home!";
	}

	@GetMapping("/export")
	public String export(String str) {
		if (str == null) {
			return "Greetings from Home!";
		}
		return str + "____";
	}
	
}
