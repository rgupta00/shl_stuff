package com.bankapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hellopage");
		mv.addObject("message", "hello to spring mvc");
		return mv;
		
	}

}
