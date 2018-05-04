package com.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldHandle {
	/**
	 * 控制器处理请求的业务方法的格式
	 * public(){
	 * 
	 * }
	 * String:当前方法处理完毕之后，所要返回的逻辑视图名称
	 */
	@RequestMapping(value="/hello")
	public String hello(){
		System.err.println("hello....");
		return "success";
	}
}
