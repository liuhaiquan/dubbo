package com.kavin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kavin.api.UserService;
import com.kavin.consumer.service.ConsumerService;

@Controller
public class UserController {

	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping("/")
	public String getUser() {
		System.out.println(consumerService.getMsg());
		return "index";
	}
}