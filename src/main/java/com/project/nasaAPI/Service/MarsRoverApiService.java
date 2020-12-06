package com.project.nasaAPI.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.nasaAPI.Response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {
   
	public MarsRoverApiResponse getRoverDate() {
	RestTemplate rt = new RestTemplate();
		
		String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=MEaxR5xw5lVBshWdtopSRyEsiUKSQ7rEPt9YD8S2";
	    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity(url, MarsRoverApiResponse.class);
        return (response.getBody());
	}
}
