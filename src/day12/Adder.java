package day12;

// Polimorphism - Method Overloading

public class Adder {
	
	int a=10,b=20;
	
	void sum() // 1) No parameters
	{
		System.out.println(a+b);
	}
	void sum(int x,int y) // 2) two parameters , same data type
	{
		System.out.println(x+y); 
	}
	void sum(int x,double y) // 3) two parameters , different data type
	{
		System.out.println(x+y); 
	}
	void sum(double x,int y) // 4) two parameters , different data type, different order
	{
		System.out.println(x+y); 
	}
	void sum(int a,int b,int c) // 5) three parameters , same data type
	{
		System.out.println(a+b+c); 
	}
	

}
