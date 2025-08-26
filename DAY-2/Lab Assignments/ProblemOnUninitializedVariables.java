
// Identify the Values of Uninitialized Variables
// Scenario:
// You are working on a program that handles different data types. Your manager has asked you to quickly
// check the values of various variables, but you’re in a rush and forget to initialize them. As you go through
// the code, you expect some values to show up, but Java has something else in mind. Your task is to fix the
// issue and ensure the variables hold proper values.
// Instructions:
// 1. Declare the following variables:
// byte a;
// short b;
// int c;
// long d;
// float e;
// double f;
// char g;
// boolean h;
// 2. Print out their values


class ProblemOnUninitializedVariables{
	
	
	public static void main(String args[]){
		
		// local variables do not have default values so we have to initialize it
		// byte a;
		// short b;
		// int c;
		// long d;
		// float e;
		// double f;
		// char g;
		// boolean h;
		
		
		byte a = 1;
		short b = 2;
		int c = 4;
		long d = 45L;
		float e = 1.2f;
		double f = 6.785262627;
		char g = 'A';
		boolean h = true;
		
		System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
	}

}

