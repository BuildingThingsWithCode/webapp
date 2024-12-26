package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import service.LoggedUserManagementService;

@Component
@RequestScope
public class LoginProcessor {
	private final LoggedUserManagementService loggedUserManagementService;
	private String username;
	private String password;
	
	public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
		this.loggedUserManagementService = loggedUserManagementService;
	}
	
	public boolean login() {
		String username = this.getUsername();
		String password = this.getPassword();
		boolean loginResult = false;
		if ("James".equals(username) && "Dean".equals(password)) {
		loginResult = true;
		loggedUserManagementService.setUsername(username);
		}
		return loginResult;
		}
		
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
