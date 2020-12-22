package com.project.nasaAPI.Response;

import java.util.ArrayList;
import java.util.List;

import com.project.nasaAPI.Model.MarsPhotoModel;

public class MarsRoverApiResponse {
   List<MarsPhotoModel> photos = new ArrayList<>();

	@Override
	public String toString() {
		return "MarsRoverApiResponse [photo=" + photos + "]";
	}

	public List<MarsPhotoModel> getPhotos() {
		return photos;
	}

	public void setPhoto(List<MarsPhotoModel> photos) {
		this.photos = photos;
	}
  
}
