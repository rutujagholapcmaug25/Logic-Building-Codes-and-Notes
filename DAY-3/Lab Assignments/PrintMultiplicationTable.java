import java.util.Scanner;

// Problem Statement:
// Write a Java program that prints the multiplication table for a given number (e.g., number 5) using a for
// loop. The program should:
// 1. Create a method printMultiplicationTable() that takes a number as a parameter and prints its
// multiplication table from 1 to 10.
// 2. Use a for loop to iterate through numbers 1 to 10 and print the multiplication results

class PrintMultiplicationTable{
	
	public static void PrintMultiplicationTable(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		for(int i = 1; i <= 10 ; i++){
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
	public static void main(String args[]){
		PrintMultiplicationTable();
	}
}