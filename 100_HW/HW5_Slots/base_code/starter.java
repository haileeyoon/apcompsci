/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less tham your total amount of money.");
		System.out.println("3. the slot machine will roll 3 number from 1 to 10.");
		System.out.println("	a. If two number match, you double your money.");
		System.out.println("	b. If three number match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("________________________________________________________");
		
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int bet;
		
		while(true){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y): ");
			String x = sc.nextLine();
			if (x.equals("Yes")||x.equals("yes")||x.equals("Y")||x.equals("y")){
					System.out.println("You have $" + money + " How much would you like to wager?");
					while(true){
						bet = sc.nextInt();
						sc.nextLine();
				if (money == 0){
					System.out.println("You've run out of money! Thanks for coming! Come back soon!");
					break;
						}
				else if (bet>money){
					System.out.println("You only have $" + money + "! Please enter a smaller number: ");
				}
				else if (bet<=0){
					System.out.println("Sneaky! NO negatives or 0! Try again: ");
				}
				else{
					System.out.println("Great! Lets play!!!");
					System.out.println("Your roles are: ");
					money = money - bet;
					int slot1 = (int)(Math.random()*10+1);
					int slot2 = (int)(Math.random()*10+1);
					int slot3 = (int)(Math.random()*10+1);
					System.out.println("___________________");
					System.out.println("|"+slot1+"|"+slot2+"|"+slot3+"|");
					System.out.println("___________________");
				if((slot1!=slot2) && (slot1!=slot3)){
						System.out.println("Didn't win this time, better luck next time!");
						System.out.println("You now have $"+ (money) +".");
						break;
				}
				else if((slot1==slot2) && (slot1==slot3)){
					System.out.println("JACKPOT! You're wager has now been tripled!");
					money=money+bet*3;
					System.out.println("You now have $" + (money) + ".");
					break;
				}
				else if(slot1==slot2||slot1==slot3||slot2==slot3){
					System.out.println("You won! You're wager has now been doubled!");
					money=money+bet*2;
					System.out.println("You now have $" + (bet+money) + ".");
					break;
				}
			}
		}
	}
	else if(x.equals("No")||x.equals("no")||x.equals("N")||x.equals("n")){
		System.out.println("Sad to see you go! You still have $" +money+" left. Come again soon! Thanks!");
		break;
	}
	else{
		System.out.println("That wasn't quite the correct asnwer. Try again.");
		System.out.println("________________________________________________________");
	}
		

}
}
}
