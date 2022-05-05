
package Github_Practice;

import java.util.Scanner;

public class B_Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no");
	int	num1 = sc.nextInt();
	System.out.println("enter the second num");
	int num2 = sc.nextInt();
	System.out.println("enter the operator");
	char operand = sc.next().charAt(0);
     int res = calculate(num1,num2,operand);
     System.out.println(num1+" "+operand+" "+num2+" = "+ res);
	}

	private static int calculate(int num1, int num2, char operand) {
		int res=0;
		switch (operand) {
		case '+':
			res=num1+num2;		
			break;
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
		}
		return res;
	}

}
