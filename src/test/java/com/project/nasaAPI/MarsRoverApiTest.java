package com.project.nasaAPI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.project.nasaAPI.Service.MarsRoverApiResponse;

public class MarsRoverApiTest {
    
	@Test
	public void smallTest () {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=MEaxR5xw5lVBshWdtopSRyEsiUKSQ7rEPt9YD8S2";
	    ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity(url, MarsRoverApiResponse.class);
	    System.out.println(response.getBody());
  	}
}
