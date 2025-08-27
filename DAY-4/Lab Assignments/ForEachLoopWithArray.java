// Write a Java program that uses a for-each loop to print all elements of an integer array. The program
// should ask the user to input 5 integers, store them in an array, and then print all the elements using a
// for-each loop.

import java.util.Scanner;

class ForEachLoopWithArray{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter numbers: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		System.out.println("The Elements you entered are: ");
		for(int elements:arr){
			System.out.println(elements);
		}
		
		in.close();
	}

}