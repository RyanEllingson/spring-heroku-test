package com.ryan.herokutest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {
	
	@GetMapping("/test")
	public String forwardToReactApp() {
		return "forward:/";
	}

}
