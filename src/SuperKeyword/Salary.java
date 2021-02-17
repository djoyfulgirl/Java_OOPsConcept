package SuperKeyword;

public class Salary {
  int a = 20;
  
  int value ;
  void add(int a, int b){
	  value = a+b;
	  System.out.println(value);
  }
  
  
	//Super keyword: It refers to immediate parent class instance variable. 
	// This keyword:  It refers to current class instance variable.
}

//steps:
/*
 * 1. create two class salary and empolyee
 * 2. create two instance variable and initialized with 20 and 30
 * 3. consider salary will be a PARENT class and employee will be child class
 * 4. I will inherite parent class into child class
 * 5. AS SOON AS WE INHERITE, super instance variable be a=20, this instance variable will be 30
 */

