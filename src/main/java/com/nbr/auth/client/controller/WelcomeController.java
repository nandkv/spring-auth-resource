package com.nbr.auth.client.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	private String message = "Hello world!";

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public Map<String, String> home() {
		return Collections.singletonMap("message", message);
	}
}
