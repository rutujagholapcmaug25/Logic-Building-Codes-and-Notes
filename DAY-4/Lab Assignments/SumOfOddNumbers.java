// Write a Java program that asks the user for a number N and calculates the sum of all odd numbers
// between 1 and N using a for loop.

import java.util.Scanner;
class SumOfOddNumbers{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++){
			if(i % 2 != 0){
				sum = sum + i;
				
			}
		}
		System.out.println("The total sum of odd numbers is: " + sum);
	}
}