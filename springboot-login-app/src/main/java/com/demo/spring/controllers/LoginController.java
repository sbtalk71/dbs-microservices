package com.demo.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	/*
	@RequestMapping(path = "/loginform", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
*/
	@RequestMapping(path = "/loginform", method = RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("username") String name, @RequestParam("password") String pwd) {
		ModelAndView mv = new ModelAndView();
		if (name.equals(pwd)) {
			mv.addObject("name", name);
			mv.setViewName("success");
		} else {
			mv.addObject("name", name);
			mv.setViewName("failure");
		}
		return mv;
	}
}
