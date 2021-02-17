package polymorphism;

public class over_riding2 extends over_riding1{
	
	void add (int a , int b){
		value = a*b;
		System.out.println("Multiplication of two number : " + value);
		
}
	
	public static void main(String[] args) {
		over_riding2 obj = new over_riding2();
		obj.add(10, 20);
	}
}
