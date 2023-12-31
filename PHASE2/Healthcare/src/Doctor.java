

public class Doctor {

	// attributes (non local scoped variables)
	int id;
	String name;
	float age; 
	char gender;
	String designation;
	boolean isOnDuty;
	
	static int noOfWorkingDays=250;
	
	double chargePerVisit=100;
	
	{
		int s=100;
	}
	
	

	// operations or methods
	
	/*
	This is a multi-line comment that
	can be used
	to provide detailed explanations for
	a block of code
	*/
	void examinePatient(Patient pat) {
		int x=10; // local scoped varibles
		System.out.println("Inside examinePatient method.");
		System.out.println("Examining "+ pat.name);
		System.out.println(x);
	}

	void prescribeMedicine() {
		System.out.println("Inside prescribeMedicine method.");
		//System.out.println(s);
	}
	
	public double calculateBill(int noOfVisits) {
		return chargePerVisit*noOfVisits;
	}
	
	public double calculateBill(String patientType, int noOfVisits) {
		return chargePerVisit*noOfVisits;
	}
	
	

}
