/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for the expressions
	1.8
	2.11
	3.12
	4.4
	5.2
	6.11
	7.2+234
	8.7 2+2
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
 	
 	Overall the predictions were correct except the the seventh expression where there are missing spaces
*/

public class TestExpressions {

	public static void main(String[] args) {
		System.out.println(2 + 3 * 4 - 6);
		System.out.println(14 / 7 * 2 + 30 / 5 + 1);
		System.out.println(( 12 + 6 ) / 3 * 2);
		System.out.println((238 % 10 + 3 ) % 7);
		System.out.println(6 * 7 % 4);
		System.out.println(2 + 2 + 3 + 4);
		System.out.println("2 + 2" + 3 + 4);
		System.out.println(3 + 4 + " 2 + 2");
	}

}
