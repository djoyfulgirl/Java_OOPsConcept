package Finalkeywords;

public class employee {//add final to this class

	int sum;
	
	final int value = 10; 
	
	final void add(int a, int b) {
		// value = 20 ( a final variable cannot be changed)
		sum = a+b;
		System.out.println("Addition of two number:" +sum);
		
	}
	
}
//Finalkeyword can be used along with variable, Methods and classes. 
//We cannot change the value of a final variable once it is initialized.
//A final method cannot be overridden. 
//A final class cannot be extended/inherit. 

