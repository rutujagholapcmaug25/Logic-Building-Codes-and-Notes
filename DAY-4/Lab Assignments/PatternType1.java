// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5
// 5*5*5*5*5
// 4*4*4*4
// 3*3*3
// 2*2

class PatternType1{
	public static void main(String args[]){
		int n = 5;
		// ascending part( 1 to n)
		for(int i = 1 ; i <=n ; i++){
			printLine(i);
		}
		for(int i = n; i >= 2; i--){
			printLine(i);
		}
	}
		private static void printLine(int num){
			for(int j = 1; j <=num; j++){
				System.out.print(num);
				if(j < num){
					System.out.print("*");
				}
			}
			System.out.println();
		}
}