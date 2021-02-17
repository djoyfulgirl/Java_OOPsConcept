package collection;

import java.util.HashMap;
import java.util.Map;

public class map_collection {

	public static void main(String[] args) {
		
		Map<Integer,String> tawa =  new HashMap<Integer,String>();
		tawa.put(1, "student");
		tawa.put(2, "teacher");
		tawa.put(3, "departments");
		tawa.put(4, "subjects");
		tawa.put(1, "student");
		
		System.out.println("Print the map : " +  tawa);
		
		int sizeoftawa = tawa.size();
		System.out.println("size of tawa :" + sizeoftawa);
		
		System.out.println("Print the value : " +  tawa.get(4));
		
		char[] a = tawa.toString().toCharArray();
		
		for(char str : a){   //example of array with foreachloop  //DISPLAYING TEH VALUES
			System.out.println(str);
		}

	}

}
