package kr.ac.hansung.dao;

public class User {
	private int id;
	private String student_id;
	private String student_name;
	private String password;
	
	public User() { }
	
	public User(String student_id, String student_name, String password) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.password = password;
	}
	
	public User(int id, String student_id, String student_name, String password) {
		this.id = id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.password = password;
	}
	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}
	public String getStudent_id() {		return student_id;	}
	public void setStudent_id(String student_id) {		this.student_id = student_id;	}
	public String getStudent_name() {		return student_name;	}
	public void setStudent_name(String student_name) {		this.student_name = student_name;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	
	
}
