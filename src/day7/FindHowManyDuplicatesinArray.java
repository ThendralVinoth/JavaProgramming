package day7;

public class FindHowManyDuplicatesinArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,100,300,200,400,100};
		int num=100;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
