package com.project.nasaAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
<<<<<<< HEAD
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> 3f6cc4ec4062510c8d6f936fe3298abc0274c605
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
<<<<<<< HEAD
	public String getHomeView(ModelMap model, @RequestParam(required = false) String marsApiRoverData) {
		if( StringUtils.isEmpty(marsApiRoverData)) {
			marsApiRoverData = "opportunity";
		}
		MarsRoverApiResponse roverData = roverService.getRoverDate(marsApiRoverData);
=======
	public String getHomeView(ModelMap model) {
		MarsRoverApiResponse roverData = roverService.getRoverDate("curiosity");
>>>>>>> 3f6cc4ec4062510c8d6f936fe3298abc0274c605
		model.put("roverData", roverData);
  		return "index";
	}
	
<<<<<<< HEAD
 
=======
	@PostMapping("/")
	public String postHomeView(ModelMap model , @RequestParam String marsApiRoverData) {
		 MarsRoverApiResponse roverData = roverService.getRoverDate(marsApiRoverData);
		 model.put("roverData",roverData);
		 
		 return "index";
	}
>>>>>>> 3f6cc4ec4062510c8d6f936fe3298abc0274c605
}
