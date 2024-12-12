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
        System.out.println("Please enter an int value");
        int number = sc.nextInt();
        System.out.println("Please enter another int value");
        int number1 = sc.nextInt();
		
		if(number != number1)
		{
			System.out.println("Your values are different");
		}
		
		else if (number == number1)
        {
            System.out.println("Your values are the same!");
        }}}

