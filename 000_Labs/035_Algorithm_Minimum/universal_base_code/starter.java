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
		int[]arr = new int [100];
		
		int min = Integer.MAX_VALUE;
	
		for(int i = 0; i<arr.length; i++){
		arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("The minumum of 100 random numbers is : " + min);
		
		int max = arr[0];
	
		for(int i = 1; i<arr.length; i++){
		arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("The maximum of 100 random numbers is : " + max);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum+arr[i];
		}
		double average = sum/arr.length;
		System.out.println("The average of 1000 random numbers is: " + average);
	
		
	}
}


