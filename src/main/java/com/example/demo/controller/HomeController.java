package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/welcome")
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		User user = new User(name);
		model.addAttribute("user", user);
		return "welcome";
	}
}