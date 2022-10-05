package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/feedback",method = RequestMethod.POST)
	public String feedback() {
		return "Thanks for your feedback";
	}
}