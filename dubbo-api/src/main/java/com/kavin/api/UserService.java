package com.kavin.api;

import java.util.List;

/**
 * dubbo 对外提供的服务接口 
 * @author Kavin
 *
 */
public interface UserService {

	    public String sayHello(String name);

	    public List getUsers();
	
}
