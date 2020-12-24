package com.project.nasaAPI.Controller;
 
import java.lang.reflect.InvocationTargetException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.nasaAPI.DTO.HomeDto;
import com.project.nasaAPI.Response.MarsRoverApiResponse;
import com.project.nasaAPI.Service.MarsRoverApiService;

@Controller
public class HomeController {
	
	 
	private MarsRoverApiService roverService;
	
	public HomeController(MarsRoverApiService roverService) {
		this.roverService = roverService;
	 }
	   
	@GetMapping("/")
 	public String getHomeView(ModelMap model, HomeDto homeDto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
			homeDto.setMarsApiRoverData("opportunity");
		}
		
		if(homeDto.getMarsSol() == null) {
			homeDto.setMarsSol(1);
		}
		
		MarsRoverApiResponse roverData = roverService.getRoverData(homeDto);
   		model.put("roverData", roverData);
   		model.put("homeDto", homeDto);
   				
  		return "index";
	}
 }
