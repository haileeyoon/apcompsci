/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer");
		int x = sc.nextInt();
		System.out.println("Please input another integer");
		int y = sc.nextInt();
		
		if(x%2 == 0){
			System.out.println(x + " is even");
		}
		else{
			System.out.println(x + " is odd");
		}
		
		boolean a = (x%3 == 0);
		boolean b = (x%4 == 0);
		boolean c = (x%5 == 0);
		
		if (c == true){
			System.out.println(x + " is divisible by 5");
		}
		if (b == true){
			System.out.println(x + " is divisble by 4");
		}
		if (a == true){
			System.out.println(x + " is divisble by 3");
		}
		else{
			System.out.println(x + " is not divisble by 3, 4,or 5");
		}
		
		if(y%2 == 0){
			System.out.println(y + " is even");
		}
		else{
			System.out.println(y + " is odd");
		}
		
		boolean d = (y%3 == 0);
		boolean e = (y%4 == 0);
		boolean f = (y%5 == 0);
		
		if (f == true){
			System.out.println(y + " is divisible by 5");
		}
		if (e == true){
			System.out.println(y + " is divisble by 4");
		}
		if (d == true){
			System.out.println(y + " is divisble by 3");
		}
		else{
			System.out.println(y + " is not divisble by 3, 4,or 5");
		}
	}
}