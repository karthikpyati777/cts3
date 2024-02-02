package com.example.searchcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="API",version="2.0",description = "SearchCity App"))
public class SearchCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchCityApplication.class, args);
	}

}
