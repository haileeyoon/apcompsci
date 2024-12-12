/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman();
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Tobey.spidermanToString();
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Andrew.spidermanToString();
		Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Tom.spidermanToString();
	}	
		
}
