// Write a Java program that asks the user to input 5 integers, stores them in an array, and then calculates and
// prints the average of the elements in the array.
import java.util.Scanner;

class ArrayAvg{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int arr[] = new int[5];
		int sum = 0;
	
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		double avg = (double)sum / (arr.length);
		System.out.println("The total sum of numbers is: " + sum);
		System.out.println("The average of umbers is: " + avg);
		in.close();
	}
}
