package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");

		int i = 5;
		System.out.println(i);

		String s = "Krina";
		System.out.println(s);

		// System.out.println("s");

		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println(c);

		// conditional statement
		if (a > b) {
			System.out.println("passed");
		} else {
			System.err.println("Failed");
		}

		// for loop

		int time = 7;
		if (time < 6) {
			System.out.println("Good eve");
		} else if (time > 10) {
			System.out.println("Good night");
		} else {
			System.out.println("Good day");
		}

		System.err.println("For loop start from here");

		for (int j = 30; j > 20; j--) {
			System.err.println(j);
		}
		
		int p =  10;
		while(p> 1)
		{
			
		System.out.println(p);
		p--;
		}

		// printMe();
	}

}
