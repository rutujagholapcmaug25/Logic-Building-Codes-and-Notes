class NestedForLoop{
	public static void main(String args[]){
	 for(int i = 0 ; i <= 5; i++){
		for(int j = 10; j >= 5; j--){
			System.out.println("(" + i + "," + j + ")");
		}
		System.out.println();
	 }
	}
}