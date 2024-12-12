/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Dog rin = new Dog("rin");
	rin.setAge(1);
	boolean h = rin.isSleeping();
	if(h){
	rin.bark();
	}
	else{
	System.out.println("rin is sleeping");	
	}
	Dog mat = new Dog("mat", "pug");

	if(h){
	mat.bark();
	}
		



	}
}
