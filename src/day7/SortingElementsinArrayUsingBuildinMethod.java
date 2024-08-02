package day7;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsinArrayUsingBuildinMethod {

	public static void main(String[] args) {
		
		//	//Accending order
		
	/*	int a[]= {100,600,200,400,500};
		
		System.out.println("Before sorting.... ");
		System.out.println(Arrays.toString(a)); // 100, 600, 200, 400, 500
		
		Arrays.sort(a);
		
	    System.out.println("After sorting.... ");
		System.out.println(Arrays.toString(a)); // 100, 200, 400, 500, 600
		
	*/
		//Reverse Decending order
		
        Integer a[]= {100,600,200,400,500};
		
		System.out.println("Before sorting.... ");
		System.out.println(Arrays.toString(a)); // 100, 600, 200, 400, 500
		
		Arrays.sort(a,Collections.reverseOrder());	
	    System.out.println("After sorting.... ");
		System.out.println(Arrays.toString(a)); //
		
		
		
		

	}

}
