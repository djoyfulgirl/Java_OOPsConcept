package Encapsulation;

public class employee {

	//What is encapsulation? Wrapping of data (variables) and code acting on that particular data (Methods) together as a single unit.
	//It is also known as Data hiding.  it is also use for security purpose. 
	//How to achieve encapsulation in Java. There are 2 ways:  
	//1, Declare the variable of a class as private
	//2, Provide public setter and getter methods to modify and view the variable values.
	
	
	private int age;//30

	public int getAge() {//view
		return age;
	}

	public void setAge(int age) {  // modify
		this.age = age;
	}
	
	public static void main(String[] args) {
		employee tawa = new employee();
		tawa.setAge(30);
   System.out.println(tawa.getAge());

		
		
	}
	
}
