package org.lzj.bms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(name="/loginUI",method=RequestMethod.GET)
	public String loginUi(){
		return "login";
	}
	
	@RequestMapping(name="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="username", required=true) String userName,
			@RequestParam(value="password", required=true) String password,
			Model model){
		System.out.println("username = " + userName + " password = " + password);
		return "index";
	}
}
