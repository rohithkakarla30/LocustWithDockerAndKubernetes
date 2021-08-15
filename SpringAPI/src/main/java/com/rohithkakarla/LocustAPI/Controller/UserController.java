package com.rohithkakarla.LocustAPI.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohithkakarla.LocustAPI.MemoryStorage.UserData;
import com.rohithkakarla.LocustAPI.Model.User;

@RestController
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	User user;

	@Autowired
	UserData userData;

	@GetMapping("/getAll")
	public List<User> Hello() {
		logger.info("Requested User Data");
		return userData.getAllUserData();

	}

	@PostMapping("/add")
	public Boolean AddUser(@RequestBody User user) {
		logger.info("Adding "+ user.toString());
		return userData.addUser(user);

	}
}
