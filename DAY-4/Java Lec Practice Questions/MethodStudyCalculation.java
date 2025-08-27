class MethodStudyCalculation{
	
	
	void calculateTDSDeductions(){
		int tds = 20;
		float salary = 50000;
		System.out.println("Your TDS is Deducted." + 50000/20);
		// System.out.println(tds);   ---> give error bcz local variable need to be initialized.
		
	}

	void calculateSalarayDeductions(){
		
		System.out.println("Your Salary is Deducted.");
	}

	public static void main(String args[]){
		MethodStudyCalculation objCal = new MethodStudyCalculation();   // created obj of class
		objCal.calculateSalarayDeductions();    // calling method 
		objCal.calculateTDSDeductions();       
		
		// method calling follow the sequence.
	}
}