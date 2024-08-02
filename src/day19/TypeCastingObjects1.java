package day19;

class Parent
{
	String name="John";
	
	void m1()
	{
		System.out.println("this is m1 from parent..");
	}
	
}

class Child extends Parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from child..");
	}
	
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
	/*	Child c=new Child();
		System.out.println(c.name); //Parent
		c.m1(); //Parent
		System.out.println(c.id); //Child
		c.m2(); //Child
	*/
		
	/*	Parent p=new Child(); //Upcasting
		System.out.println(p.name); //Parent
		p.m1(); //Parent
		
		//System.out.println(p.id); //Child //we cannot access
		//p.m2(); //Child
	*/
		
		Parent p=new Parent(); //Downcasting //not possible
		Child c=(Child) p;
		
		System.out.println(c.name); //Parent
		c.m1(); //Parent
		System.out.println(c.id); //Child
		c.m2(); //Child
		

	}

}
