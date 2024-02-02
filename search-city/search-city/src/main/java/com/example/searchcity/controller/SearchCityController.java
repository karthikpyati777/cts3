package com.example.searchcity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchcity.model.Weather;
import com.example.searchcity.service.WeatherService;

@RestController
@RequestMapping("api/v2")
public class SearchCityController {

	@Autowired
	private WeatherService service;
	
	 @GetMapping("/weather/{city}")
   public Weather getWeather(@PathVariable String city) {
       return service.getWeather(city);
   }
}
