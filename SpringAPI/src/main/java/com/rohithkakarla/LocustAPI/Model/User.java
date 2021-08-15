package com.rohithkakarla.LocustAPI.Model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private long userId;
	private String name;
	private String email;
	private int age;

	public User() {
	}

	public User(long userId, String name, String email, int age) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
