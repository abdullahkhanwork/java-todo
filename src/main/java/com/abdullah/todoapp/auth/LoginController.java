package com.abdullah.todoapp.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// http://localhost:8080/login?email=abdullahkhanwork@gmail.com
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String email, ModelMap model) {
		logger.info("This is to test logger Request param is {}", email);
		model.put("email", email);
		
		return "login";
	}
}
