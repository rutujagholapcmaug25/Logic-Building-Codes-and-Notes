// Write a Java program that asks the user for a string and counts the number of vowels (a,
// e, i, o, u) in the string. The program should then print the total number of vowels.

import java.util.Scanner;
class CountVowels{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = in.nextLine();
		
		int count = 0;
		
		input = input.toLowerCase();
		
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		System.out.println("Total number of vowels: " + count);

        in.close();
	}
}