import java.util.Arrays;
class ArrayMethods{
	public static void main(String args[]){
		int []intArray1 = {1,2,3,4,5};
		int []intArray2 = {1,2,3,4,5};
		
		System.out.println("Arrays are same or not?" + Arrays.compare(intArray1, intArray2));
		// o/p: for same array : gives 0
		//      for different array : gives any value
	}
}