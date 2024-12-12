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
		System.out.println("enter a sentence");
		String m = sc.nextLine();
		
		String result = "";
		
		
		while(true){
            if(m.indexOf(" ") == -1){
                System.out.print(m + " ");
                break;
            }
            int space = m.indexOf(" ");
            String word = m.substring(0, space);
            result = word + " " + result;
            m = m.substring(space+1);
		}
            System.out.print(result);

	}
	}
