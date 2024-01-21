

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsDemo {

	public static void main(String[] args) {
		
	}
	
	
	public static void demoList() {
		LinkedList<Integer> arrlist = new LinkedList<Integer>();

		arrlist.add(new Integer(10));
		arrlist.add(new Integer(120));
		arrlist.add(new Integer(66));
		arrlist.add(new Integer(77));

		
		Integer[] intArr= arrlist.toArray(Integer[]::new);
		
		ArrayList<Doctor> listOfDoctors = new ArrayList<Doctor>();

		Doctor d2 = new Doctor("Shasi2", 24);
		Doctor d3 = new Doctor("Shasi3", 27);
		Doctor d4 = new Doctor("Shasi4", 33);

		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		listOfDoctors.add(d4);
		
		Doctor[] doctorsArr= listOfDoctors.toArray(Doctor[]::new);

		System.out.printf("no of doctors %s \n ", listOfDoctors.size());

		

	}

}
