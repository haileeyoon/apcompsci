/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		int x = (int)(Math.random()*1000)+1;
		int guess = 0;
		while (guess != x){
			System.out.print("guess a number: ");
			guess = sc.nextInt();
			if(guess < x){
				System.out.println("Your numnber is too low");
			}
			if(guess > x){
				System.out.println("your number is too high");
			}
		}
		System.out.print("You guessed the correct answer!");

	}
}



		
