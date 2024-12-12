/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;

public myCharacter(){
	role = "No role";
	strength = 0;
	dexterity = 0;
	intelligence = 0;
	constitution = 0;
	charisma = 0;
}

public myCharacter(String h){
	if(h.equals("Wizard")||h.equals("wizard")){
		System.out.println("You've chosen the wizard! excelsior!");
		role = h;
	}
	else if(h.equals("Rogue")||h.equals("rogue")){
		System.out.println("You've chosen the rogue! how cunning!");
		role = h;
	}
	else if(h.equals("Warrior")||h.equals("warrior")){
		System.out.println("You've chosen the warrior! for honor!");
		role = h;
	}
	else{
		System.out.println("that is not one of the roles!");
		role = "No role";
	}
	
}
public String getrole() {
return role;
}

public void myToString() {
	System.out.println("Your role is " + role);
	System.out.println("Your strength trait is " + strength);
	System.out.println("Your dexterity trait is " + dexterity);
	System.out.println("Your intelligence trait is " + intelligence);
	System.out.println("Your constiution trait is " + constitution);
	System.out.println("Your charisma trait is " + charisma);
}

}
