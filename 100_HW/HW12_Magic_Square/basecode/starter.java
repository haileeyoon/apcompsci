
import pkg.*;
import java.util.Scanner;

class starter {
public static void main(String args[]) {
// CVMath.specialSquare(5);



System.out.print("Please enter how many magic squares you want to see: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); 
CVMath.SpecialSquare(n);
}
}