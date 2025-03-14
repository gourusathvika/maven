package com.PlacementManagement2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementManagement2.demo.service.UserService;
import com.PlacementManagement2.demo.entity.*;

@RestController
public class UserController {
	
	@Autowired
	private UserService uS;

	 @PostMapping("/user")
	    public User saveUser(@RequestBody User user) {
	       
	        return uS.saveUser(user);
	    }
	    

	    @GetMapping("/user")
	    public List<User> fetchUserList() {
	        //LOGGER.info("Inside fetchUserList of UserController");
	        return uS.fetchUserList();
	    }
	    


	    @GetMapping("/user/{id}")
	    public User fetchUserById(@PathVariable("id") Long Id)
	            {
	        return uS.fetchUserById(Id);
	    }
	    
	    @DeleteMapping("/user/{id}")
	    public String deleteUserById(@PathVariable("id") Long Id) {
	          uS.deleteUserById(Id);
	        return "User deleted Successfully!!";
	    }
	    
	    @PutMapping("/user/{id}")
	    public User updateUser(@PathVariable("id") Long Id,
	                                       @RequestBody  User user) {
	        return uS.updateDepartment(Id,user);
	    }
}
