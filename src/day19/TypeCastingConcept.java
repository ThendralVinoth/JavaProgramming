package day19;

//Upcasting - converting value from smaller --> larger
//int --> long
//float --> double

//Downcasting - converting value from larger --> smaller
//long --> int
//double --> float

public class TypeCastingConcept {

	public static void main(String[] args) {
	
		//Upcasting -- automatic -- smaller to larger
		
	/*	int intvalue=100;
		long longvalue=intvalue;
		
		System.out.println(longvalue);
	*/
		
	/*	float floatvalue=10.5F;
		double doublevalue=floatvalue;
		
		System.out.println(doublevalue);
	*/
		
		
		//Downcasting -- manually -- larger to smaller
		
	/*	long longvalue=10000;
		int intvalue=(int)longvalue;
		
		System.out.println(intvalue);
	*/
		
	/*	double doublevalue=125.55;
		float floatvalue=(float)doublevalue;
		
		System.out.println(floatvalue);
		
	*/
		
		//Example1:
		
	/*	int i=100;
		double d=i; //Upcasting
		
		System.out.println(d); //100.0
	*/	
		
		//Example2:
		
		double d=10.5;
		int i=(int)d; //Downcasting
		
		System.out.println(i); //10
		

	}

}
