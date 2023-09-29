package org.comit.Pluralistic.dao;

import java.util.List;

import org.comit.Pluralistic.Bean.RoleBean;
import org.comit.Pluralistic.dao.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<RoleBean> list(){
		String sql = "select * from role";
		return this.jdbcTemplate.query(sql, new RoleMapper());
	}

}
