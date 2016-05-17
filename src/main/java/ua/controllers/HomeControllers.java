package ua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
		/*Home Page*/
	@RequestMapping(value="/")
	public String welcome(){
		return "homePage";
	}
	/*Redirect to Home Page*/
	@RequestMapping(value="home")
	public String backHome(){
		return "redirect:/";
	}
	
	@RequestMapping(value="registration")
	public String register(){
		return "registrationPage";
	}
		
	@RequestMapping(value="products")
	public String viewProducts(){
		return "productsPage";
	}

	
}
