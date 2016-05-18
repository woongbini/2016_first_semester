package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.dao.CourseDAO;

@Service("courseService")
public class CourseService {
	private CourseDAO courseDAO;

	@Autowired
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	public List<Course> getCurrent() {
		return courseDAO.getCourse();
	}
	
	public List<Course> getCurrent1() {
		return courseDAO.getDivisionSum();
	}
	
	public List<Course> getCurrent2() {
		return courseDAO.getYearSemesterSum();
	}
	public List<Course> getCurrent3(int year, int semester) {
		return courseDAO.getCourseByYearSemester(year, semester);
	}

	public void insert(Course course) {
		courseDAO.insert(course);
		
	}
}
