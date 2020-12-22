package com.project.nasaAPI.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhotoModel {
	
   private Long id;
   private Integer sol;
   private MarsCamera camera;
   
   @JsonProperty("img_src")
   private String imgSrc;
   
   @JsonProperty("earth_date")
   private String earthDate;
   
   @JsonProperty("")
   private MarsRover rover;
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSol() {
		return sol;
	}
	public void setSol(Integer sol) {
		this.sol = sol;
	}
	public MarsCamera getCamera() {
		return camera;
	}
	public void setCamera(MarsCamera camera) {
		this.camera = camera;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	
	public String getEathDate() {
		return earthDate;
	}
	public void setEathDate(String eathDate) {
		this.earthDate = eathDate;
	}
	public MarsRover getRover() {
		return rover;
	}
	public void setRover(MarsRover rover) {
		this.rover = rover;
	}
	@Override
	public String toString() {
		return "MarsPhotoModel [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc
				+ ", earthDate=" + earthDate + ", rover=" + rover + "]";
	}
	
	 
	
	
     
}

