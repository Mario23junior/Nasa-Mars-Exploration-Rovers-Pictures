package com.project.nasaAPI.Service;

import java.util.ArrayList;
import java.util.List;

import com.project.nasaAPI.Model.MarsPhotoModel;

public class MarsRoverApiResponse {
   List<MarsPhotoModel> photo =  new ArrayList<>();

@Override
public String toString() {
	return "MarsRoverApiResponse [photo=" + photo + "]";
}
   
   
}
