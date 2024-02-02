package com.example.searchcity.model;

//import java.time.LocalDateTime;
//
//import org.springframework.format.annotation.DateTimeFormat;

public class Location {

	private String name;
    private String region;
    private String country;
    private String tz_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTz_id() {
		return tz_id;
	}
	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}
    
	
    
    
}
