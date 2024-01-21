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
		
		
		System.out.println( "\n Demo Stream map " );
		List<String> list = Arrays.asList("hello", "world");
		String combinedStr = list.stream().map( element -> element.toUpperCase() ).collect(Collectors.joining(", "));
		System.err.println(combinedStr);
	}

}
