package com.namankhurpia.firstapp.firstapp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.namankhurpia.firstapp.firstapp.services.todoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	todoService service;
	
	@RequestMapping(value = "/list_todo", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model)
	{
		String name = (String)model.get("name");
		model.put("todos", service.getalltodo(name));
		//this is a jsp
		return "listtodo";
	}
	
	@RequestMapping(value = "/add_todo", method = RequestMethod.GET)
	public String ShowAddtodopage(ModelMap model)
	{
		//this is a jsp
		return "todo";
	}
	
	@RequestMapping(value = "/add_todo", method = RequestMethod.POST)
	public String addtodo(ModelMap model, @RequestParam String desc)
	{
		
		String name = (String)model.get("name");
		System.out.println("NAME IN LOG"+name);
		service.addTodo(name, desc, new Date(), false);
		//this is a jsp
		return "redirect:/list_todo";
	}
	
}
