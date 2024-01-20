package collections;

import java.util.ArrayList;
import java.util.*;

import people.Doctor;

public class CollectionsDemo {

	public static void main(String[] args) {
		// demoList();

		// demoHashSet();
		// demoTreeSet();
		//demoPriorityQueue1();
		//demoPriorityQueue2();
		//demoPriorityQueue3();
		demoHashMap() ;
	}

	public static void demoHashMap() {
		Map<Integer,Doctor> doctorMappedbyId = new HashMap<Integer, Doctor>();
		
		Doctor d1 = new Doctor(1,"Ramesh", 24);		
		Doctor d2 = new Doctor(7,"Tom", 24);
		Doctor d3 = new Doctor(6,"Palak", 27);
		Doctor d4 = new Doctor(4,"Baba", 33);

		doctorMappedbyId.put(d1.id, d1);
		doctorMappedbyId.put(d2.id, d2);
		doctorMappedbyId.put(d3.id, d3);		
		doctorMappedbyId.put(d4.id, d4);
		
		// we can now do a search based on the id.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the ID of doctor whose details you want see: ");
		int id = sc.nextInt();
		
		Doctor d  = doctorMappedbyId.get(id);
		if(d!=null) {
			System.out.printf("ID %s, Name %s , Age %s \n",d.id, d.name, d.getAge());
		}else {
			System.out.printf("No such doctor with id %s \n", id);
		}
		
	}
	
	public static void demoPriorityQueue3() {

		// Creating a PriorityQueue
		Queue<String> priorityQueue = new PriorityQueue<String>( (s1,s2) -> Integer.compare(s1.length(),s2.length()) );

		// Adding elements to the PriorityQueue		
		priorityQueue.add("Orange");
		priorityQueue.add("Pear");
		priorityQueue.add("Apple");
		priorityQueue.add("Banana");

		System.out.println("Elements in the PriorityQueue: " + priorityQueue);

		// Removing elements from the PriorityQueue
		while (!priorityQueue.isEmpty()) {
			System.out.println("Polling element: " + priorityQueue.poll());
			System.out.println("Elements in the PriorityQueue: " + priorityQueue);
		}

	}
	
	public static void demoPriorityQueue2() {

		// Creating a PriorityQueue
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

		// Adding elements to the PriorityQueue
		priorityQueue.add("Pear");
		priorityQueue.add("Apple");
		priorityQueue.add("Banana");		
		priorityQueue.add("Orange");

		System.out.println("Elements in the PriorityQueue: " + priorityQueue);

		// Removing elements from the PriorityQueue
		while (!priorityQueue.isEmpty()) {
			System.out.println("Polling element: " + priorityQueue.poll());
			System.out.println("Elements in the PriorityQueue: " + priorityQueue);
		}

	}

	public static void demoPriorityQueue1() {

		// Creating a PriorityQueue
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		// Adding elements to the PriorityQueue
		priorityQueue.add(30);
		priorityQueue.add(20);
		priorityQueue.add(40);
		priorityQueue.add(10);

		System.out.println("Elements in the PriorityQueue: " + priorityQueue);

		// Removing elements from the PriorityQueue
		while (!priorityQueue.isEmpty()) {
			System.out.println("Polling element: " + priorityQueue.poll());
			System.out.println("Elements in the PriorityQueue: " + priorityQueue);
		}

	}

	public static void demoTreeSet() {

		TreeSet<Integer> setOfDoctorsAge = new TreeSet<Integer>();

		setOfDoctorsAge.add(10);
		setOfDoctorsAge.add(20);
		setOfDoctorsAge.add(30);
		setOfDoctorsAge.add(25);
		setOfDoctorsAge.add(18);

		System.out.printf("Looping all the doctors in the set \n ");
		Iterator<Integer> it = setOfDoctorsAge.iterator();
		while (it.hasNext()) {
			Integer d = it.next();
			System.out.println(d);
		}
		;

		System.out.printf("Last element in the treeset %s \n ", setOfDoctorsAge.last());
	}

	public static void demoHashSet() {

		HashSet<Doctor> setOfDoctors = new HashSet<Doctor>();

		Doctor d2 = new Doctor("Shasi2", 24);
		Doctor d3 = new Doctor("Shasi3", 27);
		Doctor d4 = new Doctor("Shasi4", 33);

		setOfDoctors.add(d2);
		setOfDoctors.add(d3);
		setOfDoctors.add(d4);

		System.out.printf("no of doctors %s \n ", setOfDoctors.size());

		setOfDoctors.add(d3);
		System.out.printf("no of doctors %s \n ", setOfDoctors.size());

		setOfDoctors.remove(d4);
		System.out.printf("no of doctors %s \n ", setOfDoctors.size());

		// Looping
		System.out.printf("Looping all the doctors in the set \n ");
		Iterator<Doctor> it = setOfDoctors.iterator();
		while (it.hasNext()) {
			Doctor d = it.next();
			System.out.printf("%s %s \n", d.name, d.getAge());
		}
	}

	public static void demoList() {
		LinkedList<Integer> arrlist = new LinkedList<Integer>();

		arrlist.add(new Integer(10));
		arrlist.add(new Integer(120));
		arrlist.add(new Integer(66));
		arrlist.add(new Integer(77));

		Doctor d1 = new Doctor("Shasi", 23);
		// ERROR arrlist.add(d1);

		ArrayList<Doctor> listOfDoctors = new ArrayList<Doctor>();
		listOfDoctors.add(d1);

		Doctor d2 = new Doctor("Shasi2", 24);
		Doctor d3 = new Doctor("Shasi3", 27);
		Doctor d4 = new Doctor("Shasi4", 33);

		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		listOfDoctors.add(d4);

		System.out.printf("no of doctors %s \n ", listOfDoctors.size());

		Doctor d5 = new Doctor("Shasi5", 39);
		listOfDoctors.add(d5);
		System.out.printf("no of doctors %s \n ", listOfDoctors.size());

		listOfDoctors.remove(d2);
		System.out.printf("no of doctors %s \n ", listOfDoctors.size());

		System.out.println("List of Doctors in this hospital:");
		for (Doctor d : listOfDoctors) {
			System.out.printf(" %s  %s \n", d.name, d.getAge());
		}
		;

		// CHALENGE: Display a list of doctors, whose age is > 30
		System.out.println("List of Doctors in this hospital,  whose age is > 30:");
		for (Doctor d : listOfDoctors) {
			if (d.getAge() >= 30) {
				System.out.printf("%s %s \n", d.name, d.getAge());
			}
		}
		;

		// can we create list of objects using loop? YES
		System.out.println("Doctors count now:");

		for (int i = 0; i < 5; i++) {
			Doctor x = new Doctor("Venky" + i, i * 10);
			listOfDoctors.add(x);
		}
		;
		System.out.printf("no of doctors %s \n ", listOfDoctors.size());

	}

}
