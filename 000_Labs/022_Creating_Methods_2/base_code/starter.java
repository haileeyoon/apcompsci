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
	
	System.out.println("What is your base number?");
	int x = sc.nextInt();
	System.out.println("What is your exponent number?");
	int y = sc.nextInt();
	int h = pow(x, y);
	
	}
	public static int pow(int x, int y){
	int power = 1;
	int base = 0;
	while(base<y){
		power=power*x;
		base=base+1;
	}
	System.out.println("Your answer is " + power);
	return power;
	
	}
}
