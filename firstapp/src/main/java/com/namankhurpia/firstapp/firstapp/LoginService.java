package com.namankhurpia.firstapp.firstapp;

public class LoginService {
	
	public boolean validateUser(String username,String password)
	{
		if(username.equals("naman") && password.equals("naman"))
			return true;
		else
			return false;
	}
}
