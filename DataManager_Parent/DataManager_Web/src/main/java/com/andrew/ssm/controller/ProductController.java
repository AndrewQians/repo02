package com.andrew.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
@Controller
public class ProductController {
	
	@RequestMapping("/findAll")
	public void findAll() {
		System.out.println("这里是控制器");
	}
}
