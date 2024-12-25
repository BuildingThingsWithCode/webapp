package com.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String home(Model page) {
		page.addAttribute("username", "James");
		page.addAttribute("color", "yellow");
		return "home.html";
	}
}
