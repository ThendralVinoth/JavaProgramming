package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		
		// -- is Decrement operator
		//case 1
		
		/* int a=10;
		a=a-1;
		System.out.println(a);
		
		a--; //a=a-1
		System.out.println(a); */
		
		//case 2 - post decrement
		
		/* int a=10;
		int res=a--;
		System.out.println(res);//10
		System.out.println(a);//9
		*/
		
		//case 3 - pre decrement
		
		int a=10;
		int res=--a;
		System.out.println(res);//9
		System.out.println(a);//9
		
	}

}
