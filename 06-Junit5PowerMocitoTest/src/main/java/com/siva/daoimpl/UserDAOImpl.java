package com.siva.daoimpl;

import com.siva.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	public String findNameById(Integer id) {
		System.out.println("findNameById() called");
		return "John";
	}

	public String findEmailById(Integer id) {
		System.out.println("findEmailById() called");
		return "john.k@gmail.com";
	}
}
