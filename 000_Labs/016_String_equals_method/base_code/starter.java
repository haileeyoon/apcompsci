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
		System.out.println("Choose your character: Wizard, Warrior, or Rogue");
		String y = sc.nextLine();
	
		if (y.equals("Wizard") || y.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (y.equals("Warrior") || y.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(y.equals("Rouge") || y.equals("rouge")){
			System.out.println("You've chosen the Rouge! How cunnning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program");
		}
		
	}
}
