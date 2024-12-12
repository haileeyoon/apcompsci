/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word");
	String m = sc.nextLine();
	
	while(true){
		if(m.indexOf(" ") == -1){
			System.out.println(spongeCase(m));
			break;
		}
		int space = m.indexOf(" ");
		String word = m.substring(0,space);
		System.out.println(spongeCase(word) + " ");
		m = m.substring(space+1);
		}
	}

	
	public static String spongeCase(String m){
	String result = "";
	
	for(int i = 0; i < m.length(); i++){
	String letter = m.substring(i,i+1);
	
		if(i % 2 == 0){
			letter = letter.toLowerCase();
		}
	    else{
			letter = letter.toUpperCase();
	    }
	    result = result + letter;
		
	}
		return result;
	}

}
