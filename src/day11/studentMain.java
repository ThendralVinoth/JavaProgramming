package day11;

public class studentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		
		//1)using object reference variables
		
	/*	stu.sid=101;
		stu.sname="John";
		stu.grad='A';
		
		stu.printStudentData();
	*/	
		
		//2)using methods
		
	/*	stu.setStudentData(101,"David",'A');
		
		stu.printStudentData();
	*/	
		
		//3)using constructor
		
		Student stu=new Student(101,"John",'A');
		
		stu.printStudentData();
		

	}

}
