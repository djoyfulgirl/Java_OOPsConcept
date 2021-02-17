package Methods_Classes_Objects;

public class tawa {
	
	int sum;
	
	void add1(int a, int b){
		sum = a+b;// adding up two number
		System.out.println(sum);
	}
	
	void add2(int a, int b, int c){
		sum = a+b+c;// adding up two number
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		 tawa polk = new tawa();//creating the object of the class
		
		 polk.add1(40, 70);
		 
		 polk.add2(20, 30, 40);
	}
}

//subtraction
//multiplication