package com.rokin.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping(value="/")
public class DefaultController {
	
	@RequestMapping(value="/")
	
	public String defaultPage() {
		return "home";

	}
}
