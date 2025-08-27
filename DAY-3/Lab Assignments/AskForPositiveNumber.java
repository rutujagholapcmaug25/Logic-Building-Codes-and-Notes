import java.util.Scanner;

// Problem Statement:
// Write a Java program that repeatedly asks the user to enter a positive number.
// 1. Create a method askForPositiveNumber() that uses a do-while loop to ask the user for a number
// until they enter a positive number.
// 2. Use the Scanner class to take the user’s input.
// 3. Once a positive number is entered, the program should display the number.

class AskForPositiveNumber {
    
    public static void askForPositiveNumber() {
        Scanner in = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Enter a positive number: ");
            number = in.nextInt();
        } while (number <= 0);
        
        System.out.println("You entered a positive number: " + number);
    }
    
    public static void main(String[] args) {
        askForPositiveNumber();
    }
}
