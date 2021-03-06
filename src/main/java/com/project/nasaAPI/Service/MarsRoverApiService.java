package com.project.nasaAPI.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.nasaAPI.DTO.HomeDto;
import com.project.nasaAPI.Model.MarsPhotoModel;
import com.project.nasaAPI.Response.MarsRoverApiResponse;
 
@Service
public class MarsRoverApiService {
   
	private static final String API_KEY = "MEaxR5xw5lVBshWdtopSRyEsiUKSQ7rEPt9YD8S2";
	
	private Map<String, List<String>> validCameras = new HashMap<>();
	
	public MarsRoverApiService() {
		validCameras.put("opportuniy", Arrays.asList("FHAZ","RHAZ","NAVCAM","PANCAM","MINITES"));
 		validCameras.put("curiosity", Arrays.asList("FHAZ","RHAZ","MAST","CHEMCAM", "MAHLI", "MARDI","NAVCAM"));
 		validCameras.put("spriti", Arrays.asList("FHAZ","RHAZ","NAVCAM","PANCAM","MINITES"));
 	}
	
	public MarsRoverApiResponse getRoverData(HomeDto homeDto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	RestTemplate rt = new RestTemplate();
	
	
 	
	 List<String> getApiUrlEnpoints = getApiUrlEnpoints(homeDto);
	 List<MarsPhotoModel> photos = new ArrayList<>();
	 MarsRoverApiResponse response = new MarsRoverApiResponse();
	 
	 getApiUrlEnpoints.stream()
	                  .forEach(url -> {
	                	  MarsRoverApiResponse apiResponse = rt.getForObject(url, MarsRoverApiResponse.class);
	                	  photos.addAll(apiResponse.getPhotos());
	                    });
		
      response.setPhotos(photos);     
	 
          return response;
	}
	 	
	 public List<String> getApiUrlEnpoints (HomeDto homeDto) {
		 List<String> urls = new ArrayList<>();

		  if(Boolean.TRUE.equals(homeDto.getCameraFhaz())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=FHAZ");
	 }

	  if(Boolean.TRUE.equals(homeDto.getCameraChemcam()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=CHEMCAM");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraMahli()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=MAHLI");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraMardi()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=MARDI");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraMast()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=MAST");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraMinites()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=MINITES");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraNavcam()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=NAVCAM");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraPancam()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=PANCAM");
	  }

	  if(Boolean.TRUE.equals(homeDto.getCameraRhaz())) {
		  urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key="+API_KEY+"&camera=RHAZ");
	  }
	   return urls;
 
     }
}

