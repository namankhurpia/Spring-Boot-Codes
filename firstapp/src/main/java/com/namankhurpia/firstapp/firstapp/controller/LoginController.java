package com.namankhurpia.firstapp.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.namankhurpia.firstapp.firstapp.services.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String returnloginmsg(ModelMap model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST )
	public String showWelcomePage(ModelMap model, @RequestParam String name,@RequestParam String password) {
		boolean isvalid = service.validateUser(name, password);
		if(isvalid)
			{
			model.put("name",name);
			return "welcome";
			}
		else
		{
			model.put("errorMessage","Invalid");
			return "login";
		}
		
	}

}
