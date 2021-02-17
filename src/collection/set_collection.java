package collection;

import java.util.HashSet;
import java.util.Set;

public class set_collection {

	public static void main(String[] args) {
 
		Set<String> value = new HashSet<String>();
		/*value.add("tawa");
		value.add("amit");
		value.add("happy");
		value.add("smile");*/
		
		value.add("A");
		value.add("C");
		value.add("D");
		value.add("B");
		value.add("C");
		value.add("D");
		
		int sizeoflist = value.size();
		System.out.println("size of list : " +  sizeoflist);
		
		for(String amit : value){   //example of array with foreachloop
			System.out.println(amit);
		}
		
		
	}

}
