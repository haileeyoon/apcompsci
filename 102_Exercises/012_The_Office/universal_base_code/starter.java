/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
	
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.16);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		pam.employeeToString();
		
		Employee rin = new Employee(1234, "Matthew", "Park", 9999.99);
		rin.employeeToString();
	
	dwight.raiseSalary(15);
		dwight.employeeToString();
	jim.raiseSalary(10);
		jim.employeeToString();
	pam.raiseSalary(5);
		pam.employeeToString();
	rin.raiseSalary(50);
		rin.employeeToString();
	
	System.out.println("This is dwight's annual Salary - $" + dwight.getAnnualSalary());
	
	System.out.println("This is jimt's annual Salary - $" + jim.getAnnualSalary());

	System.out.println("This is pam's annual Salary - $" + pam.getAnnualSalary());
	
	System.out.println("This is matthew's annual Salary - $" + rin.getAnnualSalary());
	}	
}
