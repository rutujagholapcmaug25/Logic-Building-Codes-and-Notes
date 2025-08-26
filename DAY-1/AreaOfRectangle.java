import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Length: ");
		int length = in.nextInt();
		
		System.out.println("Enter Width: ");
		int width = in.nextInt();
        
		// int length = 10;
        // int width = 20;
        
		int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}
