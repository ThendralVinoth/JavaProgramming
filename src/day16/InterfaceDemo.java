package day16;

interface Shape
{
	int length=10; // final and static variable
	int width=10; // final and static variable
	
	void circle(); // abstract method
	
	default void square() // default method
	{
		System.out.println("this is square - default method");
	}
	
	static void rectangle() // static method
	{
		System.out.println("this is rectangle - static method");
	}
}

public class InterfaceDemo implements Shape{
	
	public void circle() 
	{
		System.out.println("this is circle - abstract method");
	}
	
    void triangle() 
	{
		System.out.println("this is triangle...");
	}
    
    int x=100, y=200;
	
	

	public static void main(String[] args) {
		
		
		
		// Scenario 1
		
	/*	InterfaceDemo itobj=new InterfaceDemo();
		
		itobj.circle(); // abstract
		itobj.square(); // default
		
		Shape.rectangle(); // static method can directly access from interface
	*/
		
		// Scenario 2
		
	/*	Shape sh=new InterfaceDemo();
		
		sh.circle(); // abstract
		sh.square(); // static
		
		Shape.rectangle(); // static method can directly access from interface
		
		//sh.triangle(); // we cannot access
	    //System.out.println(sh.x + sh.y); // we cannot access
	*/	
		
		InterfaceDemo itobj=new InterfaceDemo();
		
		itobj.triangle();
		
		System.out.println(itobj.x + itobj.y);
		
		System.out.println(Shape.length * Shape.width); // accessing static variables directly  

	}

}
