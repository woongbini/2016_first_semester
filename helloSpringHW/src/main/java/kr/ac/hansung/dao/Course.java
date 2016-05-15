package kr.ac.hansung.dao;

public class Course {
	private int id;
	private int year;
	private int semester;
	private String course_code;
	private String course_name;
	private int division;
	private int credit;
	
	public Course() {	}

	public Course(int id, int year, int semester, String course_code, String course_name, int division, int credit) {
		this.id = id;
		this.year = year;
		this.semester = semester;
		this.course_code = course_code;
		this.course_name = course_name;
		this.division = division;
		this.credit = credit;
	}
	
	public Course(int year, int semester, String course_code, String course_name, int division, int credit) {
		this.year = year;
		this.semester = semester;
		this.course_code = course_code;
		this.course_name = course_name;
		this.division = division;
		this.credit = credit;
	}

	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}
	public int getYear() {		return year;	}
	public void setYear(int year) {		this.year = year;	}
	public int getSemester() {		return semester;	}
	public void setSemester(int semester) {		this.semester = semester;	}
	public String getCourse_code() {		return course_code;	}
	public void setCourse_code(String course_code) {		this.course_code = course_code;	}
	public String getCourse_name() {		return course_name;	}
	public void setCourse_name(String course_name) {		this.course_name = course_name;	}
	public int getDivision() {		return division;	}
	public void setDivision(int division) {		this.division = division;	}
	public int getCredit() {		return credit;	}
	public void setCredit(int credit) {		this.credit = credit;	}
	
	
	
	
	
	
}
