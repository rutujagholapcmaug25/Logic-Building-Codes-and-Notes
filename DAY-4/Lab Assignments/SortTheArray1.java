// Write a Java program that asks the user to input 5 integers, stores them in an array, and then sorts the
// array in ascending order using the Arrays.sort() method. After sorting, print the sorted array.
import java.util.Scanner;
import java.util.Arrays;

class SortTheArray1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int num[] = new int[5];
		System.out.println("Enter 5 integers:");
		for(int i = 0; i < num.length; i++){
			num[i] = in.nextInt();
		}
		Arrays.sort(num);
		
		System.out.println("Sorted array in ascending order:" );
		for(int elements: num){
			System.out.println(elements + " ");
		}
		
		in.close();
	}
}
