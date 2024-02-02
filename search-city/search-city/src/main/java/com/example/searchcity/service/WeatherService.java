package com.example.searchcity.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.searchcity.model.Weather;



@Service
public class WeatherService {

	 public String API_KEY="b47adb67b6404a1ea86115426230112&q=";
	 public String API_URL="http://api.weatherapi.com/v1/current.json?key=b47adb67b6404a1ea86115426230112&q=";
	 
	 
	  RestTemplate restTemplate =new RestTemplate();
	     
	  public Weather getWeather(String city) {
	    	
		    String url=API_URL + city + "&apiKey=" +  API_KEY ;
		    
		    ResponseEntity<Weather> forObject = restTemplate.getForEntity(url, Weather.class);
		                               Weather body = forObject.getBody();
		                                 
		        return body;
		        
}
}
