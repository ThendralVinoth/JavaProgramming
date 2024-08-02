package day12;

// Constructor - Overloading

public class Box {
	
	double width,height,depth;
	
	Box() // 1) No parameters
	{
	/*	width=0;
		height=0;
		depth=0;
	*/
		width=height=depth=0;	
	}
	
	Box(double w,double h,double d) // 2) three parameters , same data type
	{
		width=w;
		height=h;
		depth=d;
		
	}
	
	Box(double len) // 3) one parameter , one data type 
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
	
	
	
	
}
