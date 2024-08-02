package day9;

public class AssignmentRemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s="Java   programming    selenium  automation";
		
		s=s.replaceAll("\\s","");
		
		System.out.println(s);

	}

}
