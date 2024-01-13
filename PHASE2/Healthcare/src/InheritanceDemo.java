
public class InheritanceDemo {

	public static void main(String[] args) {
		Surgeon s1 = new Surgeon();
		
		s1.name = "Mohan";
		s1.age = 23.5F;
		
		
		Patient p1= new Patient();
		s1.examinePatient(p1);

	}

}
