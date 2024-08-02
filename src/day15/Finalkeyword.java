package day15;

class Test
{
	//int x=100;
	final int x=100;
}

public class Finalkeyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		
		//t.x=200; // change the values
		t.x=200; // cannot change the values ,because using final keyword
		
		System.out.println(t.x);

	}

}
