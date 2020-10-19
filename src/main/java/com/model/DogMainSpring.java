package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogMainSpring {
	
	public static void main(String[] args) {
		//Creating spring container and loading dogs.xml inside it
		ApplicationContext context=new ClassPathXmlApplicationContext("dogs.xml");
		//Object
		Dog dog=(Dog)context.getBean("pdog");
		dog.bark();
		System.out.println(dog);
		dog=null;
		dog=(Dog)context.getBean("pdog");
		System.out.println(dog);
	}

}
