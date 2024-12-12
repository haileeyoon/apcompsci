/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
public static void main(String args[]) {
// Your code goes below here
Warrior[] warrior = new Warrior[100];
for(int i = 0; i < warrior.length; i++){
warrior[i] = new Warrior();
}
Wizard[] wizard = new Wizard[100];
for(int i = 0; i < wizard.length; i++){
wizard[i] = new Wizard();
}

int warriorcount = 0; 
int wizardcount = 0; 
while(warriorcount < 100 || wizardcount < 100){
wizard[wizardcount].attack(warrior[warriorcount]);
if(warrior[warriorcount].isDead()){
warriorcount++;
}
if(wizardcount == 100 || warriorcount == 100){
break; 
}

warrior[warriorcount].attack(wizard[wizardcount]);
if(wizard[wizardcount].isDead()){
wizardcount++;
}
if(wizardcount == 100 || warriorcount == 100){
break; 
}

}

if(wizardcount>warriorcount){
System.out.println("The warriors have won with " + (100-warriorcount) + " remaining");
}
if(wizardcount<warriorcount){
System.out.println("The wizards have won with " + (100-wizardcount) + " remaining");
}



}
}
