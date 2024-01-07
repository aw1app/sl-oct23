

public class Doctor {

	// attributes (non local scoped variables)
	int id;
	String name;
	float age; 
	char gender;
	String designation;
	boolean isOnDuty;
	
	{
		int s=100;
	}
	
	

	// operations or methods

	void examinePatient() {
		int x=10; // local scoped varibles
		System.out.println("Inside examinePatient method.");
		System.out.println(x);
	}

	void prescribeMedicine() {
		System.out.println("Inside prescribeMedicine method.");
		//System.out.println(s);
	}

}
