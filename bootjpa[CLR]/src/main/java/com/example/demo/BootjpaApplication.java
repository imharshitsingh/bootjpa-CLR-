package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.PersonController;
import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;



@SpringBootApplication
public class BootjpaApplication implements CommandLineRunner {
    @Autowired
	private PersonRepo personRepo;
	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Person person1=new Person();
		person1.setAid(105);
		person1.setAname("naman");
		personRepo.save(person1);
		
		Person person2=new Person();
		person2.setAid(106);
		person2.setAname("raja");
		personRepo.save(person2);
	}


}
