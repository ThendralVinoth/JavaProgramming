package day19;

//Cat ct=(Cat) an;

class Animal
{
	
}

class Dog extends Animal
{
	
}

class Cat extends Animal
{
	
}

public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		//Rule 1: conversion is valid or not
		//the type of 'd' and 'c' must have some relationship(either parent to child or child to parent
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an; //valid as per rule 1
		
		//Dog dg=new Dog();
		//Cat ct=(Cat) dg; //invalid as per rule 1
		
		//Rule 2: Assignment is valid or not
		//'c' must either same or child of 'a'
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an; //valid as per rule 2
		
		//Animal an=new Dog();
		//Cat ct=(Dog) an; //invalid as per rule 2
		
		//Rule 3: 
		//The underlying object type of'd' must either same or child of 'c'
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an; //invalid as per rule 3
		
		//rule 1, rule 2, rule 3
		
		Animal an=new Dog();
		Dog dg=(Dog) an; // rule1=yes  rule2=yes   rule3=yes 
		
		
		
		
		
				
		

	}

}
