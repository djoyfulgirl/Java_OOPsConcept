package JavaException;

public class example_uncheckedexception {

	public static void main(String[] args) {
		try {
			System.out.println("1");//1
			int a = 5/5; //1st step
			System.out.println("2");//2
			System.out.println(a);//1
			System.out.println("3");//3
			System.exit(0);
			int b = 5/0;
			System.out.println("4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("5");
			e.printStackTrace();
			System.out.println("6");
			System.exit(0);
			System.out.println("7");
		}finally{ // it is used for code closer, clean up
			System.out.println("8");
			System.out.println("code executes");
		}
	}
	
	//finally : if there is exception or no exception finally code will execute
	// database: if you have open a database, you need to close it. you will close code inside database
	//text file, excel file
	//if I write system.exit before finally will it execute
	
}