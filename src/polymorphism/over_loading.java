package polymorphism;

public class over_loading {
   int value;
	// Overloading same method name with different arguments. 
	
	void add (int a, int b, int c){
		value = a+b+c;
		System.out.println("ADDITION OF 3 NUMBERS : " + value);		
	}
	
	  void add (String a){
		System.out.println("name of the person : "+a);
	}
	
	   void add (int a, int b){
		   value = a*b;
			System.out.println("MULTIPLICATION OF 2 NUMBERS : " + value);			
   	}
    
   void add (char a, char b){
		System.out.println("charcter display as : "+a);
		System.out.println("charcter display as : "+b);
   	} 
   
  
    
   public static void main(String[] args) {
	   over_loading obj = new over_loading();
	   obj.add("TAWA"); 
	   obj.add('b', 'd');
	   obj.add(10, 20);
	   obj.add(50, 60, 70);
}
    
    
}





