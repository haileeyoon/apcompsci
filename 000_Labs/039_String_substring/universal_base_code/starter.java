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
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String m = sc.nextLine();
		System.out.println("Letter by letter:");
		int s = 0;
		while(s < m.length()){
		System.out.println(m.substring(s,s+1));
		s++;
		}
		
	}
}
