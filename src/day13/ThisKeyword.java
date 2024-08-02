package day13;

public class ThisKeyword {
	
/*	int x,y; // class variable/instance variable
	
	ThisKeyword(int a, int b ) // local variable
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
*/	
	
	
	
 /*   int x,y; // class variable/instance variable
	
	ThisKeyword(int x, int y) // local variable
	{
	    this.x=x; // class variable and local variable same name using this keyword
		this.y=y; // class variable and local variable same name using this keyword
	}	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword(100,200);
		
		th.display();
	

	}
*/
	
	
/*    int x,y; // class variable/instance variable
	
	void setData(int a, int b ) // local variable
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
*/
	
    int x,y; // class variable/instance variable
	
	void setData(int x, int y ) // local variable
	{
		this.x=x; // class variable and local variable same name using this keyword
		this.y=y; // class variable and local variable same name using this keyword
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		
		th.setData(100,200);
		
		th.display();
	

	}
	
	
}
