package day17;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		
		// scenario 1:  string ----> int, double, boolean
		
		
		// String ---> int
		
		// String s="welcome"; // cannot convert to int
		
	/*	String s="12345";
		
		int sint=Integer.parseInt(s);
		
		System.out.println(sint);
	*/	
		
	/*	String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		// int st1=Integer.parseInt(s1);
		// int st2=Integer.parseInt(s2);
		
		// System.out.println(st1+st2);
	*/	
		
		
		// String ---> double
		
	/*	String s1="10.5";
		String s2="20.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
	*/	
		
		// String ---> boolean
		
	/*	String s="welcome"; // other than true, if you pass any String that will return false
		
		System.out.println(Boolean.parseBoolean(s));
	*/	
		
		
		// scenario 2: int, double, boolean, char ----> String
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
	
	
		
		
		
		

	}

}
