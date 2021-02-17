package JavaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionexample_four {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub

		
		//it is used to handle exception in java
		//it is used with method signature
		//we can declare more than one exception
		
		FileInputStream file =  new FileInputStream("D:tabcd.txt");
		Thread.sleep(1000);
		System.out.println("tawa");
	}

}
