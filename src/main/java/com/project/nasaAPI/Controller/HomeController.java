package com.project.nasaAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
   
	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		model.put("name","page");
		model.put("addres","123 fake st.");
		return "index";
	}
	
	@GetMapping("/testing")
	public String getHomeTesteView(ModelMap model) {
		model.put("name", "Jhon Doe");
		return "index";
	}
}
