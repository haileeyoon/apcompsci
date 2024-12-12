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
	System.out.println("Please enter a name:");
	String nam = sc.nextLine();
	System.out.println("How many times do you want this name to be printed?");
	int num = sc.nextInt();

	int a = 0;
		
		while (true){
			System.out.println(nam);
			if(a == num)
		{
		 break;
		}
		a = a + 1;
		}
	}
}


