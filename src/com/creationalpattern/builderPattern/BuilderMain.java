package com.creationalpattern.builderPattern;

public class BuilderMain {
	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
		.setUserId("124")
		.setUserName("Anu")
		.setAddress("Pune")
		.build();
		
		System.out.println(user);
	}

}
