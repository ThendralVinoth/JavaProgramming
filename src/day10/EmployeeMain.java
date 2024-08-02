package day10;

public class EmployeeMain {

	public static void main(String[] args) {
     
		
			
			Employee emp1=new Employee(); //object
			emp1.eid=101;
			emp1.name="John";
			emp1.job="Manager";
			emp1.sal=5000;
			
			emp1.display();
			
			Employee emp2=new Employee();
			emp2.eid=102;
			emp2.name="David";
			emp2.job="Engineer";
			emp2.sal=3000;
			
			emp2.display();



	}

}
