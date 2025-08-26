import java.util.Scanner;

class LargestOfThreeNum_InputFromUser {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = in.nextInt();
		
		System.out.println("Enter Third Number: ");
		int num3 = in.nextInt();
		
        // int num1 = 10, num2 = 25, num3 = 25;
        int largest;

        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Largest number is: " + largest);
    }
}