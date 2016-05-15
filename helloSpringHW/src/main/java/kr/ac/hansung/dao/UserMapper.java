package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setStudent_id(rs.getString("student_id"));
			user.setStudent_name(rs.getString("student_name"));
			user.setPassword(rs.getString("password"));
			return user;
		}
}
