
public class Main {

	public static void main(String[] args) {
		Doctor d1 = new Doctor();

		d1.name = "Sajesh";
		d1.age = 24.7F;

		Doctor d2 = new Doctor();

		d2.name = "Tom";
		d2.age = 29.1F;
		
		
		System.out.println("Doctor 1 name is "+d1.name);
		System.out.println("Doctor 2 name is "+d2.name);
		
		Patient pat1 = new Patient();
		pat1.name = "Sharma";
		
		d1.examinePatient(pat1);
		
		//Conditionals Demo (Flow Control)
		
		if (d1.age < d2.age) {
		//....	
			System.out.println("Doctor 1  is junior to Dctor 2");
			//if() { }else {};
			
		}else if (d1.age > d2.age) {
			System.out.println("Doctor 1  is senior to Dctor 2");
		}else {
			System.out.println("Doctor 1  and Dctor 2 have same seniority");
		}

	}

}
