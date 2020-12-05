package com.project.nasaAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.nasaAPI.Service.MarsRoverApiService;

@Controller
public class HomeController {
	
	private MarsRoverApiService roverService;
   
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
  		return "index";
	}
}
