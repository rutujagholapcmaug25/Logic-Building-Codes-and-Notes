import java.util.Scanner;

// Days of the Week
// Problem Statement:
// Write a Java program that takes an integer between 1 and 7 and prints the corresponding day of the week
// using a switch-case statement. If the input is outside the range of 1 to 7, the program should display
// "Invalid day number".
// Predefined Value:
// Day number = 3
// Expected Output:
// The day is Wednesday.

class DaysoftheWeek{
	public static void main(String abc[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Integer value: ");
		int Day = in.nextInt();
		
		switch (Day){
			
			case 1: 
				System.out.println("The day is Monday!");
				break;
			case 2: 
				System.out.println("The day is Tuesday!");
				break;
			case 3: 
				System.out.println("The day is Wednesdayday!");
				break;
			case 4: 
				System.out.println("The day is Thursday!");
				break;
			case 5: 
				System.out.println("The day is Friday!");
				break;
			case 6: 
				System.out.println("The day is Saturday!");
				break;
			case 7: 
				System.out.println("The day is Sunday!");
				break;
			default:
				System.out.println("Invalid Day Number");
		}
	}
}
