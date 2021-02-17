package mutilevel_inheritance;

public class classC extends classB{

	void mul (int a, int b){
		val = a*b;
		System.out.println("Multiplication of two numbers : " + val);
	}
	
	public static void main(String[] args) {
		classC obj = new classC();
		obj.add(10, 20);
		obj.sub(20, 40);
		obj.mul(10, 10);
	}
}
