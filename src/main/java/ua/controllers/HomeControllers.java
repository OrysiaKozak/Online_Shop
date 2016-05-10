package ua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

	@RequestMapping(value="/")
	public String welcome(){
		return "index";
	}
	
	@RequestMapping(value="/registration")
	public String registrate(){
		return "registration";
	}
	
	@RequestMapping(value="/products")
	public String viewProducts(){
		return "products";
	}
	
}
