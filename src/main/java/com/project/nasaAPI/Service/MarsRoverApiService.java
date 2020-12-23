package com.project.nasaAPI.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.nasaAPI.Response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {
   
	private static final String API_KEY = "MEaxR5xw5lVBshWdtopSRyEsiUKSQ7rEPt9YD8S2";
	
	public MarsRoverApiResponse getRoverDate(String roverType,  Integer marsSol) {
	RestTemplate rt = new RestTemplate();
		
		String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol="+marsSol+"&api_key="+API_KEY;
	    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity(url, MarsRoverApiResponse.class);
        return (response.getBody());
	}
}
