package kr.ac.hansung.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.User;
import kr.ac.hansung.dao.UserDAO;

@Service("UserService")
public class UserService {
	private UserDAO userDAO;
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public List<User> getCurrent() {
		
		return userDAO.getUser();
	}
}


