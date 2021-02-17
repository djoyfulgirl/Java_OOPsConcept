package abstraction;

public abstract class Employee {
	
	//the first oops concept
	//what is abstraction in java?
	//hiding the implementation(code behind it) and showing only the functionality of the application in software term
	
	//example: website= facebook.com , car
	
	//how to achieve abstraction in java
	//two ways to achieve 1. abstract class  2. interface
	
	//abstract class: having an abstract keyword with a class
	//abstract method: having an abstract keyword with a method . It will not have a body.
	
	//points to remember
	//a. a class which is not an abstract class, will never have an abstract method
	//b. if method is abstract in a simple class , class has to be an abstract class
	//c. an abstract class can have abstract methods and non abstract methods
	//d. if you have an abstract method in abstract class, that method(abstract method) has to be implemented in simple class(salary)
	
	void sub(){ // non abstract method, simple method(normal method) 
		System.out.println("abs");
	}
	
	abstract void add();// is used to secure the  code : security purpose during writing the code

}


