package com.example.UserRegistration.dtos;




public class UserDTO {

	private Integer userId;
	
	private String name;

	private String email;

	private String password;

	private String city;

	private String pincode;
	
	
	public UserDTO() {
		
	}


	public UserDTO(Integer userId, String name, String email, String password, String city, String pincode) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.pincode = pincode;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", city=" + city + ", pincode=" + pincode + "]";
	}

	
	
	
}
