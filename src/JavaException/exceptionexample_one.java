package JavaException;

public class exceptionexample_one {

	public static void main(String[] args) {
		try {
			int a = 5/5; 
			System.out.println(a);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{ // it is used for code closer, clean up
			
			System.out.println("code executes");
		}
	}
}