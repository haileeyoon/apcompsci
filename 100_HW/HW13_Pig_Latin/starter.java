/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
    private static String toPigLatin(String x){
        if (x.length()==1){
            return  x + "-way";
        }
        String one = x.substring(0, 1);
        String two = x.substring(1, 2);

        if (isVowel(one)){
            return x + "-way";
        }
        else if (isVowel(two)){
            return x.substring(1) + "-" + x.substring(0,1) + "ay";
        }
        else {
            return x.substring(2) + "-" + x.substring(0,2) + "ay";
        }
    }
    private static boolean isVowel(String letter){
        return letter.contains("a") || letter.contains("e") || letter.contains("i") || letter.contains("o") || letter.contains("u") || letter.contains("A") || letter.contains("E") || letter.contains("I") || letter.contains("O")|| letter.contains("U");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String arg = sc.nextLine();
        String newarg = (arg + " ");
        int c = 0;
        String end = "";

        for (int i = 0; i < newarg.length(); i++){
            if (newarg.substring(i, i+1).equals(" ")){
                String word = newarg.substring(c, i);
                end = end + toPigLatin(word) + " ";
                c = i;
            }
        }
        System.out.println("Here's your sentence in Pig Latin!");
        System.out.println(end);

    }
}
		
