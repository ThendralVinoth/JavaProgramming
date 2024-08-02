package day11;

public class GreetingsMain {

	public static void main(String[] args) {
	
		Greetings gr=new Greetings();
		gr.m1(); //1) No parameters       No return value
		
		String s=gr.m2(); //2) No parameters       return value
		System.out.println(s);
		//System.out.println(gr.m2());
	
		
		gr.m3("John"); //3) Takes parameters    NO return value
		
		String var=gr.m4("David"); //4) Takes parameters    return value
		System.out.println(var);
		//System.out.println(gr.m4("David"));

	}

}
