package com.model;

public class MainDog {
    
	//Every object has life cycle.  
	public static void main(String[] args) {
		//Who is creating instance of Dog ?? programmer
		Dog dog=new Dog();
		//who is setting attributes ??? programmer
		dog.setColor("white");
		dog.setName("Polo");
		dog.setPrice(133);
		dog.bark(); //who is calling this method? programmer
		System.out.println(dog);
		dog =null; //who is managing the life cycle of dog
	}
	
}
