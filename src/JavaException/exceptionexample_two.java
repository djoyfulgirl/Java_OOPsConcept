package JavaException;

public class exceptionexample_two {

	static int a[]=new int[5];
	static int n;
	
	public static void main(String[] args) {
		
		 
		try{    
	   
	     //   a[5]=30/0;
	     //   a[5] = 6;
			String inputString = "123.33";  
	        n = Integer.parseInt(inputString);
	       }    
		
		 catch (NumberFormatException e) {
		      System.out.println("NumberFormatException => " + e.getMessage());
		 }
	       catch(ArrayIndexOutOfBoundsException e)  //ArrayIndexOutOfBoundsException
	          {  
	    	   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	          }    
	       catch(ArithmeticException e)  //ArithmeticException
	          {  
	    	   System.out.println("Arithmetic Exception occurs");
	          }    
	       catch(Exception e)  
	          {  
	           System.out.println("Parent Exception occurs");  
	          }             
	       System.out.println("rest of the code");    
	}  
	}
