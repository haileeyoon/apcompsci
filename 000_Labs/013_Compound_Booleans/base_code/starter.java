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
		System.out.println("Please enter an integer"); 
		int x = sc.nextInt();
		System.out.println("Please enter a second integer");
		int y = sc.nextInt();
		System.out.println("Please enter a third integer");
		int z = sc.nextInt();
		
		if( (x>y) && (x>z)){
		System.out.println(x + " is the largest integer out of the three integers");
		}
		if( (y>x) && (y>z)){
		System.out.println(y + " is the largest integer out of the three integers");
		}
		if( (z>x) && (z>y)){
		System.out.println(z + " is the largest integer out of the three integers");
		}
	
		if( (x<y) && (x<z)){
		System.out.println(x + " is the smallest integer of the three integers");
		}
		if( (y<x) && (y<z)){
		System.out.println(y + " is the smallest integer of the three integers");
		}
		if( (z<y) && (z<x)){
		System.out.println(z + " is the smallest integer of the three integers");
		}
		
	}
}