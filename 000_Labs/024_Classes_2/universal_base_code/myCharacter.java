/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

public myCharacter() {
	role = "no role";
	strength = 0;
	dexterity = 0;
	intelligence = 0;
	charisma = 0;
		
	}
	
public void printCharacter(){
	System.out.println("Your role is " + role);
	System.out.println("Your strength trait is " + strength);
	System.out.println("Your dexterity trait is " + dexterity);
	System.out.println("Your intelligence trait is " + intelligence);
	System.out.println("Your charisma trait is " + charisma);
}
}

