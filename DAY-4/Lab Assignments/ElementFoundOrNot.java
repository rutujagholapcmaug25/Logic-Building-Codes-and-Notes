// Write a Java program that asks the user to input 5 integers, stores them in an array,
// and then checks whether a specific number (input by the user) is present in the array 
// using the Arrays.asList() method. If found, print "Found", otherwise print "Not Found".

import java.util.Scanner;
import java.util.Arrays;

class ElementFoundOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Use Integer[] instead of int[] because Arrays.asList() needs objects
        Integer[] numbers = new Integer[5];

        // Input 5 integers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input number to search
        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();

        // Check if number is present using Arrays.asList().contains()
        if (Arrays.asList(numbers).contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
