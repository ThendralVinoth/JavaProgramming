package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addobj=new Adder();
		
		addobj.sum(); //30  // 1) No parameters
		
		addobj.sum(100,200); //300  // 2) two parameters , same data type
		
		addobj.sum(10,20.5); //30.5  // 3) two parameters , different data type
		
		addobj.sum(20.5, 10); //30.5 // 4) two parameters , different data type, different order
		
		addobj.sum(10,20,30); //60 // 5) three parameters , same data type
		

	}

}
