/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Sharon");
        greeting("Matthew");
        
       double num =  raise(200000.25, 5);
       System.out.println(num);
       num =  raise(num, 5);
       System.out.println(num);
       num =  raise(num, 5);
       System.out.println(num);
	}
	
	public static double raise(double salary, int percent){
    	double amount = salary+(salary*(percent/100.0));
    	return amount;
    	
	}
	
	public static void greeting(String name){
	    System.out.println("Hi "+name);
	}
	
	public static void printAnimal(){
	    System.out.println(" /\\_/\\");
	    System.out.println("( o.o )");
	    System.out.println(" > ^ <");
	    
	
	}
}
