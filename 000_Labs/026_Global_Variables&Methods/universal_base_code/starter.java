/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	myCharacter test = new myCharacter();
	test.myCharacter();
	
	System.out.println("__________________________________________________");
	System.out.println("What class would you like to be?");
	String x = sc.nextLine();
	myCharacter test1 = new myCharacter(x);
	test1.myToString();
	}
}
