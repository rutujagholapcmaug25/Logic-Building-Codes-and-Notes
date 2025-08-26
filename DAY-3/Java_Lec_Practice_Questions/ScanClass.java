import java.util.Scanner;

class ScanClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your height : ");
		float height = sc.nextFloat();
		System.out.println("Hello " + name + " Welcome to the CDAC Mumbai!");
		System.out.println("My name is " + name + ", I am " + age + " years old, and my height is " + height + " cm.");
		
		
		// My name is <name>, I am <age> years old, and my height is <height> cm.
	}
}