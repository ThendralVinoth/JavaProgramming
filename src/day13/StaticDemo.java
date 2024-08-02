package day13;

//1) static variables and static methods can access static stuff directly ( without objects)  
//2) non-static variables and non-static methods can access create  objects then  stuff through objects
//3) non-static methods can access everything directly through object


public class StaticDemo {
	
	static int a=10; // static variable
	int b=20; // non-static variable
	
	static void m1() // static method
	{
		System.out.println("this is m1 static method...");
	}
	
	void m2() // non-static method
	{
		System.out.println("this is m2 non-static mthod...");
	}
	
	void m() // non-static methods
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
/*
public static void main(String[] args) {
		
		//1) static variables and static methods can access static stuff directly ( without objects)  
		
		System.out.println(a);
		m1();
		
		//2) non-static variables and non-static methods cannot access static stuff directly ( without objects)
		
		//System.out.println(b);
		//m2();
		
		//2) non-static variables and non-static methods can access create  objects then  stuff through objects
		
		StaticDemo sd=new StaticDemo();
		
		System.out.println(sd.b);
		sd.m2();
		
	    //3) non-static methods can access everything directly through object
		
		StaticDemo sd1=new StaticDemo();
		
		sd1.m();

	} 

*/
} 
