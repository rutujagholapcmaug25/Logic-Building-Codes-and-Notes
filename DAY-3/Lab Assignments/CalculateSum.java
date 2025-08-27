import java.util.Scanner;

// Problem Statement:
// Write a Java program that calculates the sum of all integers from 1 to N (where N is a positive integer)
// using a for loop. The program should:
// 1. Create a method calculateSum() that takes a number N and calculates the sum of all integers from
// 1 to N.
// 2. Use a for loop to iterate through all integers from 1 to N and add them up.


class CalculateSum{
	
	public static int calculateSum(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		return sum;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		int sum = calculateSum(num);
		System.out.println("The sum of 1 to " + num + " is: "+ sum);

		
	}
}