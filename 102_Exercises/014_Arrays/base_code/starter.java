/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int[]arr = new int[1001];
		 int i = 0;
		 while(i < 1000){
		 	arr[i] = i*3+3;
		System.out.print(arr[i] + ", ");
		 	i++;
		 }
		
		 int[]arr2 = new int[1001];
		 int h = 1000;
		 while(h>=0){
		 
		 	arr2[h] = 1000-h;
		 System.out.print(arr2[h] + ", ");
		 	h--;
		 	
		 }
	}
}
