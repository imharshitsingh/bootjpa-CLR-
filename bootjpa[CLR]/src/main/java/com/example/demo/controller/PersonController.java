package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;

@Controller
public class PersonController
{
	@Autowired
	PersonRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addPerson")
	public String addPerson(Person person)
	{
		repo.save(person);
		return "home.jsp";
	}
	
	}
