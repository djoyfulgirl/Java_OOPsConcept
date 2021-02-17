package Methods_Classes_Objects;

public class mul_assignment {
	
static int mul;
	
	void mul1(int a, int b){
		mul = b*a;// mutiply the numbers
		System.out.println(mul);
	}
	
	void mul2(int a, int b, int c){
		mul = c*b*a;// multiply the number
		
		System.out.println(mul);
	}
	

	static void mul3(int a, int b){//passing arguments
		mul = b*a;// multiply the number
		System.out.println(mul);
	}
	
	//assignment : create methods and pass arguments using different data types (string, double, float)
	
	
	public static void main(String[] args) {
		sub_assignment toast = new sub_assignment();//First way : creating the object of the class
		 toast.sub1(40, 70);
		 toast.sub2(20, 30, 40);
		 
		 mul_assignment str = new mul_assignment();//creating the object of the class
		 str.mul1(2,3);
		 str.mul2(2, 4, 6);
		 
		 //2nd way : classname.methodname. This will be only applicable when method is static
		 mul_assignment.mul3(20, 10);
		 
	}
}
	
	

