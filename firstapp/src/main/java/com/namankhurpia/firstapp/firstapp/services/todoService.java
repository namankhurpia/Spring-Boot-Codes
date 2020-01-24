package com.namankhurpia.firstapp.firstapp.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.namankhurpia.firstapp.firstapp.model.Todo;

@Service
public class todoService {
	private static List<Todo> todolist = new ArrayList<>();
	private static int todocount =3;
	
	static
	{
		todolist.add(new Todo(1, "naman 1st item", "Learn Spring MVC1", new Date(),false));
		todolist.add(new Todo(2, "naman 2nd item", "Learn Spring MVC2", new Date(),false));
		todolist.add(new Todo(3, "naman 3rd item", "Learn Spring MVC3", new Date(),false));
		
	}
	
	public void addTodo(String name,String desc, Date date, boolean status)
	{
		todolist.add(new Todo(todocount++,name,desc,date,status));
	}
	
	public void deleteTodo(int id)
	{
		Iterator<Todo> it = todolist.iterator();
		while(it.hasNext())
		{
			Todo todo = it.next();
			if(todo.getId()==id)
				it.remove();
			
		}
		
	}
	
	public void updateTodo(Todo todo)
	{
		todolist.remove(todo);
		todolist.add(todo);
	}
	
	public Todo getonetodo(int id)
	{
		Iterator<Todo> it = todolist.iterator();
		while(it.hasNext())
		{
			Todo todo = it.next();
			if(todo.getId()==id)
				return todo;
		}
		return null;
	}
	
	public List<Todo> getalltodo(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todolist) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return todolist;
    }
	
	

}
