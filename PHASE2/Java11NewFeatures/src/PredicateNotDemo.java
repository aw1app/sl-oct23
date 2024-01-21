import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
	
	int[] arr = {1,3,4,54};
	
	public boolean isEven(int i) {
		return i % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 620, 7, 8, 9, 10);
		
		
		// creating a predicate for negation
		Predicate<Integer> even = i -> i % 2 == 0;
		
		// creating a predicate object which
		// is negation os supplied predicate
		Predicate<Integer> odd = Predicate.not(even);
		
		// filtering the even number using even predicate
		List<Integer> evenNumbers = numbers.stream().filter(even).collect(Collectors.toList());

		// filtering the odd number using odd predicate
		List<Integer> oddNumbers = numbers.stream().filter(odd).collect(Collectors.toList());
		
		// filtering the odd number using odd predicate
				List<Integer> numbersDivBy5 = numbers.stream().filter( i -> i%5 == 0).collect(Collectors.toList());
				
		// Print the Lists
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(numbersDivBy5);
		
		//Stream can also help us finding max of a list. min too.
		// Math.max is only for two numbers!
		Optional<Integer> answer = numbers.stream().max( (i1,i2) -> Integer.compare(i1, i2) );
		if(answer.isPresent())
		System.out.println( answer.get());
		
		//Arrange numbers1 according the negative thier values
		System.out.println( "\n Demo custom comparision  map " );
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5); //
				Optional<Integer> answer1 = numbers1.stream().max( (i1,i2) -> i2-i1  );
				if(answer1.isPresent())
				System.out.println( answer1.get());
		
		
		System.out.println( "\n Demo Stream map " );
		List<String> list = Arrays.asList("hello", "world");
		String combinedStr = list.stream().map( element -> element.toUpperCase() ).collect(Collectors.joining(", "));
		System.err.println(combinedStr);
		
		//Challenge: Create a list of 5 doctors (having id, name and age);
		// Use Stream API, to write a one liner that displays only those doctors whose age is > 33 
		System.out.println( "\n Demo Challenge:  displays only those doctors whose age is > 33" );
		ArrayList<Doctor> listOfDoctors = new ArrayList<Doctor>();

		Doctor d1 = new Doctor("Shasi1", 34);
		Doctor d2 = new Doctor("Shasi2", 24);
		Doctor d3 = new Doctor("Shasi3", 27);
		Doctor d4 = new Doctor("Shasi4", 33.5F);
		Doctor d5 = new Doctor("Shasi5", 36);

		listOfDoctors.add(d1);
		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		listOfDoctors.add(d4);
		listOfDoctors.add(d5);
		
		 List<Doctor> doctorsWithAgeLT33 = listOfDoctors.stream()
	                .filter( (var doctor) -> doctor.getAge() >33)
	                .collect(Collectors.toList());
		 
		 doctorsWithAgeLT33.stream().forEach(doctor -> System.out.printf("Name %s, Age %s \n",doctor.name, doctor.getAge()));
	}

}
