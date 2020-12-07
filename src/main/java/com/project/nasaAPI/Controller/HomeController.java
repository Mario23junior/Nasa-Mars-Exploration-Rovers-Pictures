package com.project.nasaAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.nasaAPI.Response.MarsRoverApiResponse;
import com.project.nasaAPI.Service.MarsRoverApiService;

@Controller
public class HomeController {
	
	 
	private MarsRoverApiService roverService;
	
	public HomeController(MarsRoverApiService roverService) {
		this.roverService = roverService;
	 }
	   
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		MarsRoverApiResponse roverData = roverService.getRoverDate("curiosity");
		model.put("roverData", roverData);
  		return "index";
	}
	
	@PostMapping("/")
	public String postHomeView(ModelMap model , @RequestParam String marsApiRoverData) {
		 MarsRoverApiResponse roverData = roverService.getRoverDate(marsApiRoverData);
		 model.put("roverData",roverData);
		 
		 return "index";
	}
}
