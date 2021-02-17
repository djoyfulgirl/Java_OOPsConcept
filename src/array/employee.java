package array;

public class employee {

	public static void main(String[] args) {
		
		int b= 10;
		//array : array will always have a fixed size
		//syntax: int a[]
		
		int a[]= new int[4];  ///initializing and declaring size
		//4: 0,1,2,3
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
	//	a[4]=400;
		
		int arraysize =  a.length;
		System.out.println("array size : " + arraysize);
		
		for(int i=0;i<arraysize;i++)  //example of an array with forloop
		{
			System.out.println(a[i]);
		}
	}

}
