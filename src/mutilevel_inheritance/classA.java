package mutilevel_inheritance;

public class classA {
	
	int val;
	
	void add (int a, int b){
		val = a+b;
		System.out.println("Addition of two numbers : " + val);
	}

}
// Multilevel inheritance = when a class extend a class which extends another class then this is known as multilevel inheritance.
// for example if you have 3 classes, A,B and C. 
// A is inherited in B and inherited in C, this is known as multilevel inheritance. 

