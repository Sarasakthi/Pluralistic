package org.comit.Pluralistic.Controller;

import org.comit.Pluralistic.Bean.UserBean;
import org.comit.Pluralistic.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/create")
	public String showSignUp() {
		return "signup";
	}

	@PostMapping("/create")
	public String createUser(HttpServletRequest req) {

		String first = req.getParameter("first");
		String last = req.getParameter("last");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		UserBean user = this.createUserBean(first, last, username, password);

		this.userService.createUser(user);

		return "redirect:/login";
	}
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	private UserBean createUserBean(String first, String last, String username, String password) {
		UserBean user = new UserBean(first, last, username, password);

		return user;
	}

}
