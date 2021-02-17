package java_programing;

public class programone {

	public static void main(String[] args) {
		
		int value = 10; // int will always accepts numbers 
		String sum = "snhhjgvhfchjhkl48959036985839#@@#$#$"; //it can accept anything
		char k = 's';//it will accept only 1 alphabet
		double h = 20.76;
		
		
		// String name = "tawa"; // reverse the order and print : output should be : awat
		 
		
		
		//assignment//
		
		 String name="tawa"; //0,1,2,3
	//	 String reverse = new StringBuffer(name).reverse().toString();
		// System.out.println(reverse);
		 char[] r = name.toCharArray();
		 
		 int sizeofstring = r.length;
		 System.out.println("size of string : " + sizeofstring);
		 
		 for(int i=sizeofstring-1;i>=0;i--)//4,3,2,1
		 {
			 System.out.println(r[i]);
		 }
		 
		 //can you explain this//
		 /*
				for (int x = 1; x <= 5; x++) {
					for (int y = 1; y <= x; y++) {
					System.out.print(y+" ");
					}
				System.out.println();
				}*/
			}	

	}

