package Methods_Classes_Objects;

public class sub_assignment {
	
int sub;
	
	void sub1(int a, int b){
		sub = b-a;// subracting the numbers
		System.out.println(sub);
	}
	
	void sub2(int a, int b, int c){
		sub = c-b-a;// subtracting the number
		
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		sub_assignment toast = new sub_assignment();//creating the object of the clas
		 toast.sub1(40, 70);
		 toast.sub2(20, 30, 40);
	}
}


