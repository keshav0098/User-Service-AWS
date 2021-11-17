package com.keshav.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/welcome")	
	public String getMessage()
	{

		return "welcome to first AWS EC2 deployment for my first SpringBoot Application";

	}
}
