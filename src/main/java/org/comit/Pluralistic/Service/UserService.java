package org.comit.Pluralistic.Service;

import org.comit.Pluralistic.Bean.UserBean;
import org.comit.Pluralistic.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	public void createUser(UserBean user) {

		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		this.userDAO.createUser(user);
	}

}
