package collections;

import java.util.ArrayList;

import people.Doctor;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist 	= new ArrayList<Integer>();
		
		arrlist.add(new Integer(10));
		arrlist.add(new Integer(120));
		arrlist.add(new Integer(66));
		arrlist.add(new Integer(77));
		
		Doctor d1 = new Doctor("Shasi",23);
		// ERROR arrlist.add(d1);
		
		ArrayList<Doctor> listOfDoctors 	= new ArrayList<Doctor>();
		listOfDoctors.add(d1);
		
		Doctor d2 = new Doctor("Shasi2",24);
		Doctor d3 = new Doctor("Shasi3",27);
		Doctor d4 = new Doctor("Shasi4",33);
		
		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		listOfDoctors.add(d4);
		
		System.out.printf("no of doctors %s \n " , listOfDoctors.size());
		
		Doctor d5 = new Doctor("Shasi5",33);
		listOfDoctors.add(d5);
		System.out.printf("no of doctors %s \n " , listOfDoctors.size());
		
		listOfDoctors.remove(d2);
		System.out.printf("no of doctors %s \n " , listOfDoctors.size());
		
		
		System.out.println("List of Doctors in this hospital:");
		for(Doctor d: listOfDoctors) {
			System.out.printf(" %s  %s \n" ,d.name, d.getAge());
		}
		
	}

}
