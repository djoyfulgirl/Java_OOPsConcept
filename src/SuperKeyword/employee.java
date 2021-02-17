package SuperKeyword;

public class employee extends Salary{

	int a = 30;
	
	 void name(int a){
		 System.out.println(a);
		 System.out.println(this.a);
		 System.out.println(super.a); 
	 }
		 
	public static void main(String[] args) {
		employee k = new employee();
		k.name(70);
	}
	
	
}
