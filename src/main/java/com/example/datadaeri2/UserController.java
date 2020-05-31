package com.example.datadaeri2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping("/user/*")
@Controller
public class UserController{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/all")
	public void doAll() {
		logger.info("do all can access everybody");
	}
	
	@GetMapping("/member")
	public void doMember() {
		logger.info("logined member");
	}
	
	@GetMapping("/admin")
	public void doAdmin(){
		logger.info("admin only");
	}
	
}