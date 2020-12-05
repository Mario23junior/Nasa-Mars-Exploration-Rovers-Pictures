package com.project.nasaAPI.Model;

 
import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {
     
	private Long id;
	private String name;
	
	@JsonProperty("landing_date")
	private String landingDate;
	
	@JsonProperty("lauch_date")
	private String LauchDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}


	public String getLauchDate() {
		return LauchDate;
	}

	public void setLauchDate(String lauchDate) {
		LauchDate = lauchDate;
	}

	@Override
	public String toString() {
		return "MarsRover [id=" + id + ", name=" + name + ", landingDate=" + landingDate + ", LauchDate=" + LauchDate
				+ "]";
	}
}
