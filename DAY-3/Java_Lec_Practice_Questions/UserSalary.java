import java.util.Scanner;

class UserSalary{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int totalSalary = 0;
		for(int i = 1; i <=12 ; i++){
			System.out.println("Your Salary for month " + i + " is: " + salary* i);
			int salary = in.nextInt();
			totalSalary += salary * i;
		}
		System.out.println("Your Salary till last month is" + totalSalary);
	}
}

