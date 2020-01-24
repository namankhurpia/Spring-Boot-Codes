package com.namankhurpia.firstapp.firstapp.services;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String username,String password)
	{
		if(username.equals("naman") && password.equals("naman"))
			return true;
		else
			return false;
	}
}
