package com.kavin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kavin.consumer.service.LoginService;

@Controller
public class commonController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String getUser() {
		System.out.println(loginService.getMsg());
		return "index";
	}
}