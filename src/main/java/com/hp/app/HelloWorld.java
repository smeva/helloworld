package com.hp.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/helloworld")
	public String hellojava() {
		return "My aws 1st  App";

	}

	@RequestMapping("/viewworld")
	public String viewjava() {
		return "My aws log  App";
	}

}
