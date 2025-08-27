        // *
       // ***
      // *****
     // *******
    // *********
   // ***********
  // *************
   // ***********
    // *********
     // *******
      // *****
       // ***
        // *
		
class PatternDiamond{
	public static void main(String args[]){
		int n = 6;
		for(int i = 1; i <= n; i++){
			for(int j = i; j < n; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i - 1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
}