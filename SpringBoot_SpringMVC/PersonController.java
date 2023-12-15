package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;



@Controller
public class PersonController 
{
	@GetMapping("person")
	public String ReturningObject()
	{
		return "person";
	}
	
	@PostMapping("view")
	public String AfterSubmit(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") int age, Model model)
	{
		Person p1=new Person();
		p1.setName(name);
		p1.setAddress(address);
		p1.setAge(age);
		model.addAttribute("personlist",p1);
		return "view";
	}

}
