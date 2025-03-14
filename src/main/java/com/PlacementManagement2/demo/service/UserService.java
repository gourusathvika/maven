package com.PlacementManagement2.demo.service;

import java.util.List;

import com.PlacementManagement2.demo.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> fetchUserList();

	void deleteUserById(Long id);

	User updateDepartment(Long id, User user);

	User fetchUserById(Long id);

	
}
