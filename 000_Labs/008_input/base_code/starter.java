/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String text = sc.nextLine(); 
		
		System.out.println("Please enter your age:");
		int number = sc.nextInt();
	
		System.out.println("Please enter your birthday Month:");
		String text1 = sc.nextLine();
	
		System.out.println("Please enter your birthday Day:");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter your birthday Year:");
		int number2 = sc.nextInt();
		
		System.out.println("How much is a buck fifty:");
		double number3 = sc.nextDouble();
	}
}
