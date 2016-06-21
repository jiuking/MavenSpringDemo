package com.hjc.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/rest/page")
public class LoginController {

	@RequestMapping(value="/login")
	public ModelAndView toIndex(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/page/login");
		return mv;
	}
}
