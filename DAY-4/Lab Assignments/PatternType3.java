// 1
// 1*3
// 1*3*5
// 1*3*5*7
// 1*3*5*7*9

class PatternType3{
	public static void main(String args[]){
		int n = 5;
		for(int i = 1; i <= n; i++){
			int odd = 1;
			for(int j = 1; j <= i; j++){
				System.out.print(odd);
				if(j < i){
				System.out.print("*");
				}
				odd += 2;
			}
			System.out.println();
		}
	}
}