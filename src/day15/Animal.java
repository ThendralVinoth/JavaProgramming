package day15;

public class Animal {
	
	String color="white";
	
	void eat()
	{
		System.out.println("eating...");
	}

}

class Dog extends Animal
{
	String color="black";
	
	void displaycolor()
	{
		System.out.println(super.color); // we want parent class variable value using super keyword // using super keyword to invoke the immediate parent class variable
	}
	
	void eat()
	{
		//System.out.println("eating bread...");
		
		super.eat(); // we want parent class variable value using super keyword // using super keyword to invoke the immediate parent class variable
	}
}
