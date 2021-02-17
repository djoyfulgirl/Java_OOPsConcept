package SingleInheritance;

public class B extends A {// child

	void sub() {
		System.out.println("substraction"); // print out the String agruement
											// which we pass
		// System is a class
		// out is reference variable
		// println is a method
	}

	public static void main(String[] args) {  // JVM 
		
		B obj = new B();//1st way
		obj.add();
		obj.sub();
		
		//2nd way : classname.methodname. you have to make the method static (class A method)
		
		A.mul();
		
		//In main method, we create object first
		// object are created with help of classes only
		//we call the methods with the help of reference variable
		
		// main method helps to execute the code(we create objects and with the
		// help of reference variable we call the methods)

		// ===========PUBLIC===================
		// This is the access modifier of the main method.
		// It has to be public so that java runtime can execute this method.
		// Remember that if you make any method non-public then it’s not allowed
		// to be executed by any program, there are some access restrictions
		// applied.
		// So it means that the main method has to be public.

		// ==========static====================
		// When java runtime starts, there is no object of the class present.
		// That’s why the main method has to be static so that JVM can load the
		// class into memory and call the main method.
		// If the main method won’t be static, JVM would not be able to call it
		// because there is no object of the class is present.

		// =================main=================
		// This is the name of java main method. It’s fixed and when we start a
		// java program, it looks for the main method.

		// String[] args
		// Java main method accepts a single argument of type String array.
		// This is also called as java command

	}

}
