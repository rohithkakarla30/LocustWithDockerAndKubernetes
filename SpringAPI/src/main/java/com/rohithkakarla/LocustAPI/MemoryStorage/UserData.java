package com.rohithkakarla.LocustAPI.MemoryStorage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rohithkakarla.LocustAPI.Model.User;

@Service
public class UserData {
	
	List<User> userDetails;

	public UserData() {
		userDetails = new ArrayList<User>();
		userDetails.add(new User(12345678,"RohithKakarla","karthik.kakarla30@gmail,com",20));
	}
	
	public boolean addUser(User user) {
		return this.userDetails.add(user);
	}
	
	public List<User> getAllUserData(){
		return this.userDetails;
	}
	
}
