package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {
private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from user";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	//querying and returning a multiple object
		public List<User> getUser() {
			String sqlStatement = "select * from user ";
			return jdbcTemplateObject.query(sqlStatement, new UserMapper());
		}
}
