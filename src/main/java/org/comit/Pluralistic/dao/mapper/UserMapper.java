package org.comit.Pluralistic.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.Pluralistic.Bean.UserBean;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserBean> {

	@Override
	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
