package com.highlight.helloworld;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	public Greeting index() {
		return new Greeting(counter.incrementAndGet(), "Hello world!");
	}

}
