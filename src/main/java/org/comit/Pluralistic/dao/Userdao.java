package org.comit.Pluralistic.dao;

import org.comit.Pluralistic.Bean.UserBean;
import org.comit.Pluralistic.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public UserBean findUser(String username) {

		String sql = "select * from user where username = ?";

		return this.jdbcTemplate.queryForObject(sql, new UserMapper(), username);
	}

	// Create User
	public void createUser(UserBean user) {

		String sql_createUser = "insert into user values(?,?,?,?)";

		this.jdbcTemplate.update(sql_createUser, user.getUsername(), user.getFirstName(), user.getLastName(),
				user.getPassword());
	}

}


