/*
 *	Author:  
 *  Date: 
*/

class Character {

	String role = new String("Wizard");
	int strength = 5;
	int dexterity = 5;
	int intelligence = 5;
	int charisma = 5;

}



class starter {
	public static void main(String args[]) {
		Character me = new Character();
		System.out.println("Your role is a " + me.role);
		System.out.println("Your strength trait is " + me.strength);
		System.out.println("Your dexteristy trait is " + me.dexterity);
		System.out.println("Your intelligence trait is " + me.intelligence);
		System.out.println("Your charisma traite is " + me.charisma);
		// Your code goes below here
	
		
	}
}
