package day3;

public class AssignmentSwapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are:"+a +" " +b);
		
		//Logic1 - Third variable
		
	/*	int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping values are:"+a +" " +b);
     */
		
		//Logic2 - use + and - without using third variable
	 
	 /* a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		System.out.println("After swapping values are:"+a +" " +b);
	*/	
		
		//Logic3 - use * and / without using third variable
		// here a and b values should not be zero
		
	/*	a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		
		System.out.println("After swapping values are:"+a +" " +b);
	*/
		
		//Logic4 - bitwise operator XOR(^)
		
    /*	a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20
		
		System.out.println("After swapping values are:"+a +" " +b);
	*/	
		
		//Logic5 - Single statement
		
		b=a+b-(a=b);
		
		System.out.println("After swapping values are:"+a +" " +b);
		
		
		
	}

}
