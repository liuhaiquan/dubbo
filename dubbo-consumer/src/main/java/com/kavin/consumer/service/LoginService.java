package com.kavin.consumer.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kavin.api.UserService;

@Service
public class LoginService {

	
	@Reference    //使用dubbo提供的reference注解引用远程服务
	private UserService userService;
	
	
	public String getMsg() {
		return userService.sayHello("张三");
	}
}
