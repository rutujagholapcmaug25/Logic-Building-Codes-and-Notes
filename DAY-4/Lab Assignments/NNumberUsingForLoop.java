// Write a Java program that asks the user for a number N and then prints the numbers from 1 to N using a
// for loop.

import java.util.Scanner;

class NNumberUsingForLoop{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		
		for(int i = 1; i <= num ; i++){
			System.out.print(i + " " );
		}
	}
}