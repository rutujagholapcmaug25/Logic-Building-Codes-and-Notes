import java.util.Scanner;

// Problem Statement:
// Write a Java program that checks whether the year is a leap year or not. A year is a leap year if:
// It is divisible by 4, but not divisible by 100, or
// It is divisible by 400.

class LeapYear{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year = in.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + " is a leap year");
		} 
		else {
			System.out.println(year + " is not a leap year");
		}
		
	}

}