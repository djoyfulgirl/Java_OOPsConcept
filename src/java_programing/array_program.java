package java_programing;

import java.util.ArrayList;
import java.util.List;

public class array_program {


	
	public static void main(String[] args) {
		
		//Solution
	int r[] = {2,4,6,8};//2+4+6+8=20
	
	  r[0]=2;
	  r[1]=4;
	  r[2]=6;
	  r[3]=8;
	  
	  int arraysize =  r.length;
		System.out.println("array size : " + arraysize);
		
		for(int tawa : r)   //example of array with foreachloop
			System.out.println(tawa);  
	  
		int sum = 0;
		for (int p : r){
		           //     sum += p;
		             sum = sum+p;   //0+2=2 , 2+4=6 , 6+6=12, 12+8=20
		         //    System.out.println("ADDITION OF THE NUMBERS : " + sum);
		            }
		System.out.println("ADDITION OF THE NUMBERS : " + sum);
		
	
	     int max = r[0];//2
	     for(int i=0;i<arraysize;i++)
	    	 if(r[i]>max)  ///r[0]=2>2 ;2=2
	    	 {
	    		max=r[i] ;
	    	 }
	    	 System.out.println("greatest value is :" + max);
	    	
	    	 
	    	 int  small= r[0];//2
		     for(int i=0;i<arraysize;i++)
		    	 if(r[i]<small) ///r[0]=2>2 ;2=2
		    	 {
		    		 small=r[i] ;
		    	 }
		    	 System.out.println("smallest value is :" +small );
		    	
	}
}
	  
			  
/*	small
	//get the size
	 int sizeofstring = r.length;
	 System.out.println("size of string : " + sizeofstring);
	 
	// using list collection
	 List<Integer> tawa =  new ArrayList<Integer>(); //List is an interface and its class is ArrayList
		tawa.add(2);
		tawa.add(4);
		tawa.add(6);
		tawa.add(8);

		int sizeoflist = tawa.size();
		System.out.println("size of list : " +  sizeoflist);
		
		for(int test : tawa){   //example of array with foreachloop  //DISPLAYING TEH VALUES
			System.out.println(test);
		}
	 
	 
	 int test = 2;
	 for(int i=0;i<sizeoflist;i++);
	 System.out.println("the summation of the numbers" + sizeoflist);
	 
	 
	
	//PRINT VALUE
	  int a = 2;
	 for(int i=0;i<sizeofstring;i++);
	 System.out.println(r[a]);
	*/
	 
	 
	
	 
	 //Assignment
	//get size --done
	//print value--done
	//addition--DONE
	//get the greatest value
	//get the smallest 
	
	

	
	



	

