package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
	name = "Clifford";
	age = 3;
	breed = "big red dog";
		
	}
	
	public Dog(String n, int a, String b){
	name = n;
	age = a;
	breed = b;
	
	}
	
	public Dog(String n){
		name = n;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String n, String b){
	name = n;
	age = 1;
	breed = b;
	
	}
	
	public Dog(String n, int a){
	name = n;
	age = a;
	breed = "dog dog";
	
	}

	public void setName(String h){
	name = h;
	}
	public void setAge(int h){
	age = h;
	}
	public void setBreed(String h){
	breed = h;
	}
	public String getName(){
	return name;
	}
	public int getAge(){
	return age;
	}
	public String getBreed(){
	return breed;
	}
	public boolean isSleeping(){
	int h = (int)(Math.random()*2);
	if (h == 0){
	return false;
	}
	else{
	return true;
	}
	}
	public void bark(){
	System.out.println(name + " barks!");
	}

}

