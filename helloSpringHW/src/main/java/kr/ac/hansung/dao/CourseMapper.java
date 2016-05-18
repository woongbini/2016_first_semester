package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<Course>{

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
			Course course = new Course();
			course.setId(rs.getInt("id"));
			course.setYear(rs.getInt("year"));
			course.setSemester(rs.getInt("semester"));
			course.setCourse_code(rs.getString("course_code"));
			course.setCourse_name(rs.getString("course_name"));
			course.setDivision(rs.getString("division"));
			course.setCredit(rs.getInt("credit"));
			return course;
	}

}
