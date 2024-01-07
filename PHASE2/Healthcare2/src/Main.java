
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
		
		d1.examinePatient();

	}

}
