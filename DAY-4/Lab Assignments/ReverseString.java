// Write a Java program that asks the user for a string and then prints the reverse of that
// string.

import java.util.Scanner;
class ReverseString{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String input = in.nextLine();
		
		String reverse = "";    // initially empty string 
		for(int i= input.length()-1; i >= 0; i--){
			reverse += input.charAt(i);
		}
		
		System.out.println("Reversed String: " + reverse);
		in.close();
	}
}