package collection;

import java.util.ArrayList;
import java.util.List;

public class list_collection {

	public static void main(String[] args) {
		
		List<Integer> tawa =  new ArrayList<Integer>(); //List is an interface and its class is ArrayList
		tawa.add(1000);
		tawa.add(2000);
		tawa.add(3000);//2
		tawa.add(4000);
		tawa.add(2000);
		tawa.add(3000);
		tawa.add(4000);
		
		int sizeoflist = tawa.size();
		System.out.println("size of list : " +  sizeoflist);
		
		for(int amit : tawa){   //example of array with foreachloop  //DISPLAYING TEH VALUES
			System.out.println(amit);
		}
		
		tawa.remove(2);
		System.out.println("Print the list : " +  tawa);
		
		
	
		
		//please play with other predefined methods
	}
}
