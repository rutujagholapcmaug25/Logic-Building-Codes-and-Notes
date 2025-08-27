import java.util.Scanner;

// Problem Statement:
// Write a Java program that includes a method to calculate the sum of two numbers.
// 1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates their sum,
// and returns the result.
// 2. In the main method, use the Scanner class to prompt the user to enter two integers.
// 3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum


class SumOfTwoNumbers{
	public static int SumOfTwoNumbers(int a, int b){
		return a + b;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = in.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = in.nextInt();
		
		int sum = SumOfTwoNumbers(a, b);
		System.out.println("The sum of a and b is: " + sum);
	}
}