package com.boot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {
	
	@RequestMapping("/tester")
	@ResponseBody
	public String handleTest() {
		int a=12;
		int b=343;
		return "this is test \t sum of a+b= "+(a+b);
	}
	
	
}
