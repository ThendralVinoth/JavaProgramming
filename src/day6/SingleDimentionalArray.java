package day6;
/*
 1)Declare an array
 2)add values into array
 3)Find length of an array
 4)read single value from an array
 5)read multiple value from an array
 */

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		//1)Declaring an array
		
		//2)add values into array
		
		//Approach1
		
	/*	int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=100;
	*/
		
		//Approach2
		
		//int a[]= {100,200,300,400,500};
		
		//3)Find length of an array
		
	/*	int a[]= {100,200,300,400,500};
		
		System.out.println("length of an array:"+a.length);
	*/	
		
		//4)read single value from an array
		
     /*   int a[]= {100,200,300,400,500};
		
		System.out.println(a[2]); //here 2 is index
	*/	
		
		//5)read multiple value from an array
		
		//Normal for loop
		
	/*	 int a[]= {100,200,300,400,500};
		
		for(int i=0;i<=4;i++) // i<=4   i<=a.length-1   i<5  i<a.length
		{
			System.out.println(a[i]); //100 200 300 400 500 
		}
	*/
		
		//Enhanced for loop / for...each loop
		
		int a[]= {100,200,300,400,500};
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
	     System.out.println();
	}

}
