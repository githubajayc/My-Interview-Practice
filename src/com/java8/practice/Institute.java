package com.java8.practice;

import java.util.List;

public class Institute {

	private String institue;
	private List<String> cities;
	
	public String getInstitue() {
		return institue;
	}
	public void setInstitue(String institue) {
		this.institue = institue;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Institute(String institue, List<String> cities) {
		super();
		this.institue = institue;
		this.cities = cities;
	}
	
	
	
}
