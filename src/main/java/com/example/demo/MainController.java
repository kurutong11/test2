package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String test() {
		return "This is spring";
	}

	@RequestMapping("/test")
	public String test2() {
		return "This is spring";
	}
}
