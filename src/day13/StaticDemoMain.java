package day13;

public class StaticDemoMain {

	public static void main(String[] args) {
		
	
			
			//1) static variables and static methods can access static stuff directly ( without objects)  
			
			System.out.println(StaticDemo.a); // mention class name using different class  
			StaticDemo.m1(); // mention class name using different class 
			
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

}
