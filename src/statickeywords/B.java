package statickeywords;

public class B extends A{
       
	
	
	static void sub(int a, int b){
		value=a-b;
		System.out.println("Substraction of two number : " + value);
	}
	
	
	public static void main(String[] args) {
		/*B obj = new B();
		obj.add(10, 20);
		obj.sub(20, 10);*/
		
		//classname.method(making the method static)
		A.add(30, 40);
		
		B.sub(50, 20);

	}

}
