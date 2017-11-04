/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 11/04/2017
*/

public class ComputePay {
	public static void main(String[] args) {
		//declare variables
		int hoursWorked=4 + 5 + 8 + 4;
		double hourlySalary=8.75;
		double totalPay;
		
		
		System.out.println("My total hours worked:");
		System.out.println(hoursWorked);
		
		System.out.println("My hourly salary:");
		System.out.println(hourlySalary);
		
		System.out.println("My total pay:");
		System.out.println(hoursWorked* hourlySalary);
	}
}