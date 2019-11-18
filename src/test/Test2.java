package test;

import selenium.Test4;

public class Test2 {

	
	/* if you want to create a object outside the main method you have to create object as a static.
	 * and we can refer as globally declare object
	*/
	// for example
	
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
       
		System.out.println(" I am in Main");
		
		// declare method in mainMethod
		printMe();
		//scanMe();
		// Create a Object of class Test2 and call the non-static method.
		// Here t is a local object
		Test2 t = new Test2();
		t.scanMe();
		
		// static object method
		t2.scanMe();
		
		// object creation for non-static method from Test3 Class
		 Test3 t3 = new Test3();
		   
		   // call static method directly using class
		  t3.testing2();
		
	     Test3.testing1();
	     
	     
	     //  call static and non-static method outside the package
	     
	     Test4.testing3(); //static
	     
	     Test4 t4 = new Test4(); //  non-static method
	     t4.testing4();
		
	}

	public static void printMe()
	{
		t2.scanMe();
		System.out.println(" I am in Printme");
	}
	
	public void scanMe()
	{
		System.out.println(" I am in scan");
	}
}


// you can't call nonstactic method from nonstatic method.
// To call nonstatic method you can create a object and call the method.