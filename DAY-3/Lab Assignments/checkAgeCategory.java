import java.util.Scanner;

// Problem Statement:
// Write a Java program that includes a method to check the age category.
// 1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints
// whether the user is a minor, adult, or senior citizen.
// 2. In the main method, use the Scanner class to prompt the user to enter their age.
// 3. Pass the user's age to the checkAgeCategory() method

class checkAgeCategory{
	public static void checkAgeCategory(int age){
		if(age <=18){
			System.out.println("You are a Minor.");
		} else if(age <= 60){
			System.out.println("You are an adult.");
		} else{
			System.out.println("You are a senior citizen.");
		}
	}
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		
		checkAgeCategory(age);
		
	}
}