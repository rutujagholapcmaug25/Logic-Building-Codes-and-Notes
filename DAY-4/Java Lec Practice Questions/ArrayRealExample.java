class ArrayRealExample{
	public static void main(String args[]){
		double []heights = {5.11, 5.3, 6.5, 5.2, 5.5, 4.2, 3.8, 6.8};
		int countOfStudents = heights.length;
		System.out.println(countOfStudents);
		float avg, sum = 0;
		for(double elements: heights){
			sum += elements;
		}
		avg = sum / countOfStudents;
		
		System.out.println("The average of heights is: " + avg);
	}
}