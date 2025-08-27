import java.util.Scanner;
class WhileLoopStudyWithUserInput{
	public static void main(String args[]){
		Scanner objSc = new Scanner(System.in);
		System.out.println("What is the count?");
		int count = objSc.nextInt();
		while(count <20){
			System.out.println("The Count is " + count);
			count++;
		}
	}
}