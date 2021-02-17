package forloopconcept;
 
public class example2 {
  public static void main(String[] args) {
	 for (int a=2; a<10; a=a*a){   //why is it printing out two values
		 System.out.println(a);
	 }
	 
}
}

//a=2 : 2
//a=4 : 4
//a=4*4 : 16<10 which is false, it will come out of the loop
