// Write a Java program that uses a for-each loop to calculate the sum of all elements in a given integer
// array. The program should ask the user to input 5 integers, store them in an array, and then compute the
// sum of these numbers using the for-each loop.

import java.util.Scanner;
class SumOfElementsOfArray{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		System.out.println("Enter numbers: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		
		for(int elements:arr){
			sum = sum + elements;
		}
		System.out.println("The sum of elements you entered are: " + sum);
		
		in.close();
	}
}