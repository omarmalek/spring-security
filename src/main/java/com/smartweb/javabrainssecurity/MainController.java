package com.smartweb.javabrainssecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/")
	public String servEveryOne() {
		return "<h1> Every One</h1>";
	}
	@GetMapping("/user")
	public String servUser() {
		return "<h1> User Page</h1>";
	}
	@GetMapping("/admin")
	public String servAdmin() {
		return "<h1> Admin Page</h1>";
	}
}
