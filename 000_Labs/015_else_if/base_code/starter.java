/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("Guess a number that is between 1 and 1000");
		int y = sc.nextInt();
		
		if(y == 555){
			System.out.println("YOU GUESSED CORRECT NUMBER!");
		}
		else if (y>555){
			System.out.println("Your number is higher than the correct number.The correct number is 555.");
		}
		else if (y<555){
			System.out.println("Your number is lower than the correct number. The correct number is 555.");
		}
		
	}
}
