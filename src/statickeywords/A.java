package statickeywords;

public class A {
	static int value;
	
	static void add(int a, int b){ //make his method static
		value=a+b;
		System.out.println("Addition of two number : " + value);
	}

}
