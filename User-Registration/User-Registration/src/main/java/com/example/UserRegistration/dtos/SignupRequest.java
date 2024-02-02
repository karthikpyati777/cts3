package com.example.UserRegistration.dtos;




public class SignupRequest {

	private String name;

	private String email;

	private String password;

	private String city;

	private String pincode;
	
	
	public SignupRequest() {
		
	}

	public SignupRequest(String name, String email, String password, String city, String pincode) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.pincode = pincode;
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
		return "SignupRequest [name=" + name + ", email=" + email + ", password=" + password + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}


}
