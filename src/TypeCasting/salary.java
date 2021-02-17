package TypeCasting;

public class salary {

	public static void main(String[] args) {
		
		char d = 'C';
		int S=d;
		System.out.println(S);// ascii code
		
		char k = 'F';
		String L= Character.toString(k);
		System.out.println(L);
		
		//int to string
		int a =10;
		String data = String.valueOf(a);
		System.out.println(data);
		
		
		//string to int
		String s ="80";
		int l = Integer.parseInt(s);
		System.out.println(l);
		
		//double to int
		double tawa =  10.52;
		int q = (int)tawa;
		System.out.println(q);
		
		
		
		

	}

}
