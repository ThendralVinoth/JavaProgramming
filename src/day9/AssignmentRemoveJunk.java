package day9;

public class AssignmentRemoveJunk {

	public static void main(String[] args) {
		
		String s="#$%&*$% JAVA  !@# 123 selinium  456 $%#@&* testing";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);
		

	}

}
