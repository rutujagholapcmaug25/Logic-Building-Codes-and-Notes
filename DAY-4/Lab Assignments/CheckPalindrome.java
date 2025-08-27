// Write a Java program that asks the user for a string and checks whether the string is a
// palindrome. A palindrome is a string that reads the same backward as forward (ignoring
// spaces and punctuation).

import java.util.Scanner;

class CheckPalindrome{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String input = in.nextLine();
		
		String reverse = ""; 
		for(int i = input.length()-1; i >= 0 ; i--){
			reverse = reverse + input.charAt(i);
		}
		
		 if (input.equals(reverse)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        in.close();
		
	}
	
}
