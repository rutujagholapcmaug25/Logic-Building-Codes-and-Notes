import java.util.Scanner;

class WhileLoopWithUserInput{
	public static void main(String args[]){
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int count = objSc.nextInt();
		while(count < 20){
			System.out.println("The count is " + count);
			count++;
		}
		
	}
}