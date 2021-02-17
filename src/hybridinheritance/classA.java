package hybridinheritance;

public class classA extends classC {

	

	void sub (int a, int b){
		val = b-a;
		System.out.println("Substraction of two numbers : " + val);
	}
	
	public static void main(String[] args) {
		classA obj =  new classA();
		obj.add(10, 20);
		obj.sub(40, 10);
	}
}
