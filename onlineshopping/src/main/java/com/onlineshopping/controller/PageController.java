package com.onlineshopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class PageController {
 
	@RequestMapping("/page")
	public ModelAndView helloWorld() {
 
		String message = "Hello Spring Web MVC";
		return new ModelAndView("page", "message", message);
	}
}
