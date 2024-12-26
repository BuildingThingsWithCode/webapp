package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
	private String username;
	private String password;

	public boolean login() {
		if ("James".equals(username) && "Dean".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
