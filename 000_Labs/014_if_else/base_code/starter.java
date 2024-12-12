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
		System.out.println("Is it raining today? Choose 1 or 2");
		System.out.println("1. yes");
		System.out.println("2. no");
		int x = sc.nextInt();
		
		if(x == 1){
            System.out.println("Bring an umbrella.");
		}
		
		else
		{
			System.out.println("Bring suncreen.");
		}
		System.out.println("Guess a number that is between 1 and 1000");
		int y = sc.nextInt();
		
		if(y == 555){
			System.out.println("YOU GUESSED CORRECT NUMBER!");
		}
		else
		{
			System.out.println("You guessed the wrong number");
		}
	}
}
