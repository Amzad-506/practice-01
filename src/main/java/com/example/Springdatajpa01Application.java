package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.EntityBean;
import com.example.repo.ContactsRepo;

@SpringBootApplication
public class Springdatajpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springdatajpa01Application.class, args);
		ContactsRepo bean = context.getBean(ContactsRepo.class);
		EntityBean eb=new EntityBean();
		eb.setCid(101);
		eb.setCname("Amzad");
		eb.setCnumber("9966332255");
		bean.save(eb);
		System.out.println("Amzad Record Inserted");
		EntityBean eb1=new EntityBean();
		eb1.setCid(103);
		eb1.setCname("Azam");
		eb1.setCnumber("9966355263");
		bean.save(eb1);
		System.out.println("Azam Record Inserted");
	}

}
