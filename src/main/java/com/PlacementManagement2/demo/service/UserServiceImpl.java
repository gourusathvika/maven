package com.PlacementManagement2.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlacementManagement2.demo.entity.User;
import com.PlacementManagement2.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository uR;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return uR.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return uR.findAll();
	}

	@Override
	public User fetchUserById(Long id) {
		// TODO Auto-generated method stub
		return uR.findById(id).get();
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		uR.deleteById(id);
	}

	@Override
	public User updateDepartment(Long id, User user) {
		// TODO Auto-generated method stub
		 User userDB = uR.findById(id).get();

	       if(Objects.nonNull(user.getName()) &&
	       !"".equalsIgnoreCase(user.getName())) {
	           userDB.setName(user.getName());
	       }

	      
	       if(Objects.nonNull(user.getAddress()) &&
	               !"".equalsIgnoreCase(user.getAddress())) {
	           userDB.setAddress(user.getAddress());
	       }

	       return uR.save(userDB);
		
	}
	

}
