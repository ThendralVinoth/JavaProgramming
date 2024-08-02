package day9;

public class StringVsStringBufferStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable
		
	/*	String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome  //immutable, cannot change original value of s
	*/	
		
		//StringBuffer - mutable
		
	/*	StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s);//welcometo java //mutable, can change original value of s
    */
		
		//StringBuilder - mutable
		
		StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);//welcometo java //mutable, can change original value of s
	}

}
