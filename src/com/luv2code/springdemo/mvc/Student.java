package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String LastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private String favoriteOperatingSystem;
	
	
	public Student() {
		
		
		//populate country option: used ISO country code
		
		countryOptions =new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("Ar","Egypt");
		countryOptions.put("FR","france");
		countryOptions.put("DE","Germany");
		
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String getFavoriteOperatingSystem() {
		return favoriteOperatingSystem;
	}


	public void setFavoriteOperatingSystem(String favoriteOperatingSystem) {
		this.favoriteOperatingSystem = favoriteOperatingSystem;
	}
	
	
	
	
	

}
