/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(Math.max(13-6*11,30%7*(-2)));
		System.out.println(Math.sqrt(3*8+31%7));
		System.out.println(Math.pow(37/3, 35%21));
		System.out.println(Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value x:");
		double number = sc.nextDouble(); 
		System.out.println("Please enter a value y:");
		double number1 = sc.nextDouble();
		System.out.println(Math.max(number,number1));
		System.out.println(Math.sqrt(number1));
		System.out.print(Math.pow(number,number1));
		
		
	}
}
