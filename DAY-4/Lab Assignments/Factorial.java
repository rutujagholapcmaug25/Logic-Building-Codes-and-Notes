// Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop.

import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++){
				fact = fact * i;
			}
		System.out.println("The factorial of a number is: " + fact);

	}
	
}