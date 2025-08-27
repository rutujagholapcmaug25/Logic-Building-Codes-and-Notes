// Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how
// many positive and negative numbers are present in the array.

import java.util.Scanner;
class PosinitiveNegativeNumbers{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[6];
		System.out.println("Enter numbers: ");
		int positiveCount = 0;
		int negativeCount = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		for(int elements:arr){
			if(elements > 0){
				positiveCount++;
			}
			else if(elements < 0){
				negativeCount++;
			}
		}
		System.out.println("Number of positive Integers: " +positiveCount);
		System.out.println("Number of negative Integers: " +negativeCount);
		
		in.close();
	}
}