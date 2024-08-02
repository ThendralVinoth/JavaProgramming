package day14;

// Single Inheritance

class A
{
	int a=100;
	void display()
	{
	 System.out.println(a);	
	}
}

class B extends A
{
	int b=200;
	void show()
	{
	 System.out.println(b);	
	}
}

// Multi Level Inheritance

class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
	
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
		// Single Inheritance
		
	/*	B bobj=new B(); 
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();
	*/	
		// Multi Level Inheritance
		
		C cobj=new C();
		
		//System.out.println(cobj.a);
		//System.out.println(cobj.b);
		//System.out.println(cobj.c);
		
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();

	}

}
