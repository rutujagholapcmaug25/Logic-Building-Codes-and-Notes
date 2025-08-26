import java.util.Scanner;

class DoWhileLoop{
	public static void main(String args[]){
		Scanner objSc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int count = objSc.nextInt();
		do{
			System.out.println("The count is: " + count);
			count++;
		} while( count < 20);
		
	}
}
