package com.candidjava.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.User;

@Controller
public class UserController {
	
	User users = new User();
	
	@GetMapping("index")
	public ModelAndView register(User user) {
		return new ModelAndView("register");
	}

	//@RequestMapping(value="/register", method=RequestMethod.POST)
	@PostMapping("/register")  // 4.3
	public ModelAndView create(User user) {
		ModelAndView model = new ModelAndView("view");
		// user bean will be automatically binded to view . refer @ModelAttribute
		
			users.setName(user.getName());
			users.setEmail(user.getEmail());
			users.setGender(user.getGender());
			users.setLanguage(user.getLanguage());
			users.setCountry(user.getCountry());
			users.setPassword(user.getPassword());
		
		return model;
	}

	@GetMapping("/register")
	public ModelAndView viewData(User user) {

		ModelAndView model = new ModelAndView("register");
		return model;
	}

}
