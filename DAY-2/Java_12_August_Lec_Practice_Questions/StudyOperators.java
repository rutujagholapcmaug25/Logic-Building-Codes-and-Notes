class StudyOperators{
	public static void main(String args[]){
		
		int salary = 50;
		float tds = 12;
		boolean faithful = true;
		
/*
		
		// Arithemetic Operators:  
		
		System.out.println(salary - tds);
		System.out.println(salary + tds);
		System.out.println(salary * tds);
		System.out.println(salary / tds);
		System.out.println(salary % tds);
		
		
		System.out.println(salary++);    // post increment 
		System.out.println(++salary); 	 // pre increment
		
		System.out.println(faithful);
		System.out.println(!faithful);    // inverts boolean value
		
*/
		
		// Assignment Operators
		
		System.out.println(salary+=2); 
		System.out.println("After += : " + salary); 
		System.out.println(salary-=2); 
		System.out.println("After -= : " + salary); 
		System.out.println(salary*=2); 
		System.out.println("After *= : " + salary);
		System.out.println(salary/=2); 	
		System.out.println("After /= : " + salary); 
		System.out.println(salary%=2); 	
		System.out.println("After %= : " + salary); 
	

		
	}
}