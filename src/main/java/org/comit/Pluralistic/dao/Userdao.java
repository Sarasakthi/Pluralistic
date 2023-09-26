package org.comit.Pluralistic.dao;

import org.comit.Pluralistic.Bean.UserBean;

public class Userdao {

	public UserBean findUser(String username) {

		String sql = "select * from user where email = ?";

		return this.jdbcTemplate.queryForObject(sql, new UserMapper(), username);
	}

}
