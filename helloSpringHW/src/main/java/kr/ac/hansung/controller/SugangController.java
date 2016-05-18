package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.service.CourseService;

@Controller
public class SugangController {
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//수강신청 보여주는 method()
	@RequestMapping(value="/sugang", method=RequestMethod.GET)
	public String sugangCourse(Model model, Course course) {
		
		List<Course> course3 = courseService.getCurrent1();
		model.addAttribute("course3", course3);
	
		return "sugang";
	}
	
	//수강신청 처리해주는 method()
	@RequestMapping(value="/sugang_register", method=RequestMethod.GET)
	public String sugangRegister(Model model, Course course) {
		
		System.out.println(course);
		courseService.insert(course);
		
		return "sugang_register";
	}
}
