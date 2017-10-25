package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	
	 @RequestMapping()
	  public String index(Model model) {
		
	    return "index";
	  }
	
	@RequestMapping("login")
	public String login(@RequestParam("status") int status , Model model){
		if(status == 1){
			
		}else if(status == 2){
			
		}
		return "login";
	}
}
