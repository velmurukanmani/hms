package com.bloomtree.employee.service;

import java.util.List;

import com.bloomtree.employee.model.TestUser;



public interface UserService {
	
	TestUser findById(long id);
	
	TestUser findByName(String name);
	
	void saveUser(TestUser user);
	
	void updateUser(TestUser user);
	
	void deleteUserById(long id);

	List<TestUser> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(TestUser user);
	
}
