package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}

	@PostMapping("/")
	public String validateLogin(@RequestParam String username, @RequestParam String password, Model model) {
		String message = "Login failed";
		if (username.equals("James") && password.equals("Dean")) {
			message = username + ", you are now logged in";
		}
		model.addAttribute("message", message);
		return "login.html";
	}
}
