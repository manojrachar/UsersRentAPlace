package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.entity.Login;
import com.user.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public boolean validateUser(Login login) {

		String validate = userDAO.findByUseremail(login.getEmail()).getPassword();
		System.out.println(validate);
		if(login.getPassword().equals(validate)) {
			System.out.println("LS");
			return true;
		}
		else {
			System.out.println("LF");
			return false;
		}

	}


	public boolean insertUser(User user) {
		if(this.userDAO.existsById(user.getUserid())) {
			return false;
		}
		else {
			this.userDAO.save(user);
			return true;
		}
	}

	public User getUserByEmail(String email) throws Exception {

		return this.userDAO.findByUseremail(email);
	}

	public boolean updateUser(User user)
	{
		if(this.userDAO.existsById(user.getUserid())) {

			this.userDAO.save(user);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean deleteByEmail(String email) throws Exception
	{
		this.userDAO.deleteByUseremail(email);
		return true;

	}

	public List<User> getAllUsers(){

		List<User> users = new ArrayList<>();
		this.userDAO.findAll().forEach(user->users.add(user));
		return users;

	}

}
