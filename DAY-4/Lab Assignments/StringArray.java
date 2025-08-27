// Write a Java program that uses a for-each loop to print all the names stored in a String array. The program
// should ask the user to input 4 names, store them in an array, and then print each name using the for-each
// loop.

import java.util.Scanner;

class StringArray{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		String arr[] = new String[4];
		int sum = 0;
		System.out.println("Enter names: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextLine();
		}
		System.out.println("Names you Entered: ");
		for(String elements:arr){
			System.out.print(elements + " " );
		}
		
		in.close();
	}
}