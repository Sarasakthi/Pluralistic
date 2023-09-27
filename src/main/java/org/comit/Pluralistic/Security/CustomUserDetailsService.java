package org.comit.Pluralistic.Security;

import org.comit.Pluralistic.Bean.UserBean;
import org.comit.Pluralistic.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

	@Service("UserDetailsService")
	public class CustomUserDetailsService implements UserDetailsService {

		@Autowired
		UserDAO userDAO;

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

			UserBean user = this.userDAO.findUser(username);

			if (user == null) {
				throw new UsernameNotFoundException("User not found" + username);
			}
			// System.out.println(user.getUsername());

			return new CustomUserDetails(user);
		}

	}


