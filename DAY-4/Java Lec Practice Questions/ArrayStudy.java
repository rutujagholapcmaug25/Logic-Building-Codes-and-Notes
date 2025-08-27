class ArrayStudy{
	
	
	/*
		Array Decalaration: 
		int[] array;
		int []array;
		int a[];
		
		Decalaration, Instantiation & Initialization:
		Approch1: int a[] = {10, 20, 30, 40};
		Approch2: int[] a = new int[100];
		
	*/
	public static void main(String args[]){
		float[] salArray = {20.2f, 50.3f, 62.8f, 63.37f};
		int[] calArray = new int[5];
		System.out.println(salArray[2]);
		salArray[2] = 10.11f;
		System.out.println("After Updation: " + salArray[2]);
		
		// System.out.println(salArray.length);
		// System.out.println(calArray.length);
		
		for(int i = 0; i < salArray.length; i++){
			System.out.println(salArray[i] + " ");
		}
		
		
		// for each loop: 
		for(float elements : salArray){
			System.out.println(elements + " ");
		}
	}
	
}