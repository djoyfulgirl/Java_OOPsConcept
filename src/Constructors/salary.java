package Constructors;

public class salary {
	int value;
	//What is a constructor?  Constructor is a block (Similar to method) having same name that of class name
	//It has no return type not even void.
	//Void: It is a keyword and used to specify that a method doesn't return anything. As main() method doesn't return anything, 
	//its return type is void. ... main: It is the name of Java main method. It is the identifier that the JVM looks for as the starting point of the java program.
   //There are 2 types of constructor: 1, Default constructor 2, Parameterised constructor. 
	
	
	salary(){         //default constructor  : is called by default when you create the object
		System.out.println("my name is Tawa");
	}
	
     salary(int a, int b){        //Parameterized constructor
		value = a+b;
		System.out.println("Addition of 2 Number: " + value );
	}
     
     salary(int a, int b , int c){        //Parameterized constructor
 		value = a+b+c;
 		System.out.println("Addition of 3 Number: " + value );
 	}
	
	public static void main(String[] args) {
	//salary obj = new salary();
	new salary();
	 new salary(10,20);
	 new salary(10,20 , 30);	
	}
	
	
	//void does not return anything
	void div(){
		
	}
	
	//you have to specify return type
	int sub(){
		
		return 0;
	}

}
