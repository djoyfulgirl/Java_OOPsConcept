package Outsidethemodifier;

import Modifier.employee;

public class student extends employee {   // It is necessary to import the package name. 

	public static void main(String[] args) {
	
		student obj = new student();
		   obj.methodProtected();
		   obj.methodPublic();
		

	}

}
