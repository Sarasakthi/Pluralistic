package org.comit.Pluralistic.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.Pluralistic.Bean.RoleBean;
import org.springframework.jdbc.core.RowMapper;

public class RoleMapper implements RowMapper<RoleBean> {

	@Override
	public RoleBean mapRow(ResultSet rs, int rowNum) throws SQLException {

		RoleBean role = new RoleBean();
		role.setIdRole(rs.getInt("idrole"));
		role.setNameRole(rs.getString("name_role"));
		role.setDescRole(rs.getString("desc_role"));
		role.setStatus(rs.getString("status"));
		return role;
	}

}
