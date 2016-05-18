package kr.ac.hansung.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.service.CourseService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private CourseService courseService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Model model) {
		
		List<Course> course = courseService.getCurrent1();
		model.addAttribute("course",course);
		
		List<Course> course2 = courseService.getCurrent2();
		model.addAttribute("course1", course2);
		
		return "home";
	}
	
}
