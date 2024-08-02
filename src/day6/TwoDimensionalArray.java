package day6;
/*
1)Declare an array
2)add values into array
3)Find length of an array
4)read single value from an array
5)read multiple value from an array
*/

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//1)Declaring an array
		
		//2)add values into array
		
		//Approach1
		
	/*	int a[][]=new int[3][2]; //int [][]a=new int[3][2]
		                         //int []a[]=new int[3][2]
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][0]=600;
	*/	
		
		//Approach2
		
	/*	int a[][]= {{100,200},
				    {300,400},
				    {500,600}
		           };
	*/
		
		//3)Find length of an array
		
	/*	int a[][]= {{100,200},
			    {300,400},
			    {500,600}
	           };
		
		System.out.println("Length of rows:"+a.length);
		System.out.println("Length of columns:"+a[0].length);
	*/	
		
		//4)read single value from an array
		
	/*	int a[][]= {{100,200},
			    {300,400},
			    {500,600}
	           };
		
		System.out.println(a[2][1]); //600
	*/	
		
		//5)read multiple value from an array
		
		//Normal for loop(Nested for loop)
		
	/*	int a[][]= {{100,200},
			    {300,400},
			    {500,600}
	           };
		
		for(int r=0;r<=2;r++) // for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=1;c++) // for(int c=0;c<=a[r].length-1;c++)
			{
			// System.out.println(a[r][c]);//100 200 300 400 500 600
				
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	*/	
		
		//Enhanced for loop / for...each loop
		
		int a[][]= {{100,200},
			    {300,400},
			    {500,600}
	           };
		for(int arr[]:a)
		{
			for(int x:arr) 
			{
		   System.out.print(x+" ");
			}
		   System.out.println();
		}


	}

}
