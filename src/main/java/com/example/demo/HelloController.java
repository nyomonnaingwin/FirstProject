package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "firstpage";
	}
	
	@GetMapping("/second")
	public String index1() {
		return "secondpage";
	}
}