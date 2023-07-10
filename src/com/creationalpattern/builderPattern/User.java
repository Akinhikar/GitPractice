package com.creationalpattern.builderPattern;

public class User {

	private final String userId;
	private final String userName;
	private final String address;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.address = builder.address;

	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getAddress() {
		return address;
	}
	
	

	// Innerclas

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}



	static class UserBuilder {
		private String userId;
		private String userName;
		private String address;

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder() {

		}

		public User build() {
			return new User(this);
		}
	}

}
