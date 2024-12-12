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
	System.out.print("Input a number and we will print out every prime number until that number: ");
	int num = sc.nextInt();
	
	printprime(num);
	}
	public static boolean prime(int num){
	int d = num-1;
	boolean prime = true;
	while(d>=2){
	if(num % d == 0){
	prime = false;
	break;
	}
	d = d - 1;
	}
	return prime;
	}

	public static void printprime(int num){
	int x = 2; 
	while (x<=num){
	if(prime(x)){
	System.out.println(x);
	}
	x = x + 1;
	}
	}
}


