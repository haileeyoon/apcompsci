/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer:");
		int number = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first):");
		int number1 = sc.nextInt();
		
		System.out.println("Your range is " +(number)+ " to " +(number1));
		System.out.println("Here are the five numbers generated in that range.");
		System.out.print((int)(Math.random()*(number1-number)) + number + ", ");
		System.out.print((int)(Math.random()*(number1-number)) + number + ", ");
		System.out.print((int)(Math.random()*(number1-number)) + number + ", ");
		System.out.print((int)(Math.random()*(number1-number)) + number + ", ");
		System.out.print((int)(Math.random()*(number1-number)) + number + ", ");
		
	}
}
