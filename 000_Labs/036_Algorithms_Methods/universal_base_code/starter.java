/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for(int h = 0; h < x.length; h++){
		System.out.println(x[h]);
		}
		}
		public static int getArrayAverage(int[] a){
		int sum = 0;
		for(int h = 0; h < a.length; h++){
			sum = sum+a[h];
		}
		int average = sum/a.length;
		return average;
		}
		
		public static int getMinArray(int[] y){
		int min = Integer.MAX_VALUE;
		for(int h = 0; h < y.length; h++){
			if(y[h]<min){
			min = y[h];
		}
		}
		return min;
		}
		
		public static int getMaxArray(int[] m){
		int max = m[0];
		for(int h = 1; h<m.length; h++){
			if(m[h]>max){
				max = m[h];
		}
		}
		return max;
		}
			
	public static void main(String args[]) {
		// Your code goes below here
		int[]arr = new int[100];
		for(int h = 0; h<100; h++){
		arr[h] = (int)(Math.random()*100)+1;
		}
		toStringArray(arr);
		System.out.println("The average of 100 random numbers is: " + getArrayAverage(arr));
		System.out.println("The minimum of 100 random numbers is: " + getMinArray(arr));
		System.out.println("The maximum of 100 random numbers is: " + getMaxArray(arr));
		}
		}