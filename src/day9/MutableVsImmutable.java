package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//mutable - we can change
		
		int a[]= {20,10,40,50,30};
		
		System.out.println(Arrays.toString(a)); //[20, 10, 40, 50, 30]
		
		Arrays.sort(a); // mutable
		
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
		
		//immutable - we cannot be change
		
		String s=new String("welcome");
		
		System.out.println(s); //welcome
		
		s.concat("java"); // immutable
		
		System.out.println(s); //welcome
		
		//immutable - cannot be change
		              // if we can change stored in another variable
		
		String s1=new String("welcome");
				
		System.out.println(s1); //welcome
				
				
		String concatstring=s1.concat("java"); 
				
		System.out.println(concatstring); //welcomejava
	}

}
