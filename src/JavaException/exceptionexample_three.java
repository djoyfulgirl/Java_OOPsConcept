package JavaException;

public class exceptionexample_three {

	public static void main(String[] args) {
	
//Throw: it should declare exception using throw keyword otherwise the code will give compilation error. 
		// The throw keyword is mainly used to throw custom exception.
		//The throw statement is used together with an exception type.
		//Syntax of throw keyword: throw new (exception)
		//throw is used inside the method
		//you can only declare one exception
		
		exceptionexample_three obj = new exceptionexample_three();
		obj.validate(19);
		System.out.println("rest of the code");
		
		
	}
	
	 void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }

	
	
	
}
