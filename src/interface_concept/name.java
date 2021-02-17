package interface_concept;

public interface name {
	
	int str=20;// we can declare variables in interface but that variable has to be initialized

	// default abstract method: it means method without body
	void add();//we are not going to use abstract keyword for this method
	

	//interface is similar to class, the difference is that it has a keyword interface.  
	//interface will always have by default an abstract method: it will have method without body
	
	//interface can also have variables
	
	// if you are inheriting any method(default abstract method) from interface , that method has to be public in simple class
	
	//method with out body is interface
	//if you have a method which is by default abstract method , then that method( default abstract method) has to be implemented in simple class(student)
	//we have to use implements keyword in order to inherit
	
	//interface will not have any normal methods 
	/*
	void sub(){ //this is a normal method having body(curly bracket open and close)
		
	}
	
	*/
	
}
