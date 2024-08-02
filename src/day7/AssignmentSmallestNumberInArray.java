package day7;

public class AssignmentSmallestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {50,30,40,20,60};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("smallest Number in Array:"+min);

	}

}
