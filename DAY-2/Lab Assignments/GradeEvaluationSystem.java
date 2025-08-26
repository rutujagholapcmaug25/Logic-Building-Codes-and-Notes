import java.util.Scanner;

// Problem Statement:
// Write a Java program that calculates the average marks of a student and determines the grade based on the
// following criteria:
// Grade A: Average marks ≥ 90
// Grade B: Average marks between 70 and 89
// Grade C: Average marks between 50 and 69
// Grade D: Average marks between 30 and 49
// Fail: Average marks < 30

class GradeEvaluationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        // Calculate total and average
        int total = sub1 + sub2 + sub3;
        float average = total / 3;


		// predefined values: 
		// int m1 = 80;
		// int m2 = 82;
		// int m3 = 90;
		// float average = (m1 + m2 + m3)/3;
		

        // Determine grade
        String grade;
         if (average >= 90) {
            grade = "A";
        } else if (average >= 70 && average <= 89) {
            grade = "B";
        } else if (average >= 50 && average <= 69) {
            grade = "C";
        } else if (average >= 30 && average <= 49) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
