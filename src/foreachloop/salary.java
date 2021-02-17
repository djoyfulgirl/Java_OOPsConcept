package foreachloop;

public class salary {

	public static void main(String[] args) {

    //advanced version of for loop
		//mainly used in arrays and collection
		//syntax: for(datatype anyvariablesname : arrayname)
		
		int a[]= new int[4];  ///initializing and declaring size
		//4: 0,1,2,3
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
		int arraysize =  a.length;
		System.out.println("array size : " + arraysize);
		
		for(int tawa : a){   //example of array with foreachloop
			System.out.println(tawa);
		}
	}

}
