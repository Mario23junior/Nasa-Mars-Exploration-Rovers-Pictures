package com.project.nasaAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
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
 	public String getHomeView(ModelMap model, @RequestParam(required = false) String marsApiRoverData) {
		if(StringUtils.isEmpty(marsApiRoverData)) {
			marsApiRoverData = "opportunity";
		}
		MarsRoverApiResponse roverData = roverService.getRoverDate(marsApiRoverData);
   		model.put("roverData", roverData);
  		return "index";
	}
 }
