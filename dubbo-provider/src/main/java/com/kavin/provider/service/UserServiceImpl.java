package com.kavin.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.kavin.api.UserService;
@Service //使用dubbo提供的service注解，注册暴露服务
public class UserServiceImpl implements UserService{

    public String sayHello(String name) {
        return "Hello " + name;
    }


}
