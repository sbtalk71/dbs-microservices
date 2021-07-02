package com.demo.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(path="/test",method = RequestMethod.GET)
	public ModelAndView getDemoPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("demo");
		mv.addObject("name","Shantanu");
		return mv;
	}
}
