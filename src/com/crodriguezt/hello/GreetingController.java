package com.crodriguezt.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final long counter = 1L;

	@RequestMapping("greeting")
	public Greeting getGreetings(@RequestParam(value = "name", defaultValue = "World") String name) {

		Greeting g = new Greeting(counter, String.format(template, name));

		return g;
	}

}
