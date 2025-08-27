import java.util.Scanner;

class StudyOfForLoopSalarySave{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your Salary");
		int salary = sc.nextInt();
		for(int i=1;i<13; i++){
		System.out.println("You are saving - " + salary * i + " after " + i + " Month");
		}
	}
}

