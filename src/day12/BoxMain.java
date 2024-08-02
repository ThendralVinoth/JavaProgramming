package day12;

public class BoxMain {

	public static void main(String[] args) {
		
	/*	Box b=new Box(); // 1) No parameters
		
		double v=b.volume();
		
		System.out.println(v); // 0
		
		//System.out.println(b.volume());
	*/
		
	/*	Box b=new Box(10.5,15.5,5.0); // 2) three parameters , same data type
        
		double v=b.volume();
		
		System.out.println(v); // 813.75
		
		//System.out.println(b.volume());
		
	*/
        Box b=new Box(10.5); // 3) one parameter , one data type
        
		double v=b.volume();
		
		System.out.println(v); // 1157.625
		
		//System.out.println(b.volume());
		

	}

}
