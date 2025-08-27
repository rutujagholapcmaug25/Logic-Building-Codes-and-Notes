// Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds and
// prints the largest element in the array. (Explore in-built method to solve this)

import java.util.Scanner;
import java.util.Arrays;
class LargestNumberInArray2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter numbers: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		
		int largest = Arrays.stream(arr).max().getAsInt();
		// Arrays.stream(arr) --> Convert array to stream
		// .max() --> Find largest value, returns OptionalInt
		// .getAsInt() --> Extract the Integer
		System.out.println("Largest Element is: " + largest);
		
		in.close();
	}
}