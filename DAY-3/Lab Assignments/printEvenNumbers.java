
// Problem Statement:
// Write a Java program that prints all even numbers between 1 and 50 using a while loop.
// 1. Create a method printEvenNumbers() that prints all even numbers from 1 to 50.
// 2. Use a while loop to iterate from 1 to 50 and print the even numbers.
// Sample Output:
// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50

class printEvenNumbers{
	
	public static void printEvenNumbers(){
		int i = 1;
		while(i <= 50){
			if(i % 2 == 0){ 
				System.out.print(i + " ");
		}
		i++;
		}
	}
	
	public static void main(String args[]){
		printEvenNumbers();
	}
}
