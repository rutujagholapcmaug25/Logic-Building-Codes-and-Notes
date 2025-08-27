import java.util.Scanner;
// You are required to write a menu-driven Java program that implements four separate
// problems. The program should allow the user to select which problem to run, execute the
// corresponding logic, and then return to the menu until the user chooses to exit.
// The four problems are as follows (Already done in assignment 2, just put it in switch
// case):
// Problem 1: Grade Evaluation System
// Problem 2: Leap Year Check
// Problem 3: Day of the week
// Problem 4: Identify Default Values of Variables
// Case 5: Exit

class MenuDrivenProgram{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		// menu
		System.out.println("Choose an option: ");
		System.out.println("1. Grade Evaluation System");
		System.out.println("2. Leap Year Check");
		System.out.println("3. Day of the week");
		System.out.println("4. Identify Default Values of Variables");
		System.out.println("Enter Your option: ");
		int choice = in.nextInt();
		
		switch(choice){
		
			case 1:
				// Grade Evaluation System
				// Input marks for 3 subjects
				System.out.print("Enter marks for Subject 1: ");
				int sub1 = in.nextInt();

				System.out.print("Enter marks for Subject 2: ");
				int sub2 = in.nextInt();

				System.out.print("Enter marks for Subject 3: ");
				int sub3 = in.nextInt();

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
				
			break;
			
			case 2 :
				// Leap Year Check
				System.out.println("Enter the Year: ");
				int year = in.nextInt();
				
				if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
					System.out.println(year + " is a leap year");
				} 
				else {
					System.out.println(year + " is not a leap year");
				}
				
			break;
			
			
			case 3: 
				// Day of the week
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
			
			break;
		
			case 4: 
				// Identify Default Values of Variables
				byte a = 1;
				short b = 2;
				int c = 4;
				long d = 45L;
				float e = 1.2f;
				double f = 6.785262627;
				char g = 'A';
				boolean h = true;
				
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				System.out.println("d: " + d);
				System.out.println("e: " + e);
				System.out.println("f: " + f);
				System.out.println("g: " + g);
				System.out.println("h: " + h);
			
			break;
			
			default:
				System.out.println("Invalid choice!");
			
		}
		
		in.close();
		
		
	}
}