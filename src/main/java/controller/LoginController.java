package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private final LoginProcessor loginProcessor;
	
	@Autowired
	public LoginController(LoginProcessor loginProcessor) {
		this.loginProcessor = loginProcessor;
	}
	
	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}

	@PostMapping("/")
	public String validateLogin(@RequestParam String username, @RequestParam String password, Model model) {
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		boolean loggedIn = loginProcessor.login();
		String message = "Login failed";
		if (loggedIn) {
			message = username + ", you are now logged in";
		}
		model.addAttribute("message", message);
		return "login.html";
	}
}
