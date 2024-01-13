package demo.polymorphism;

public class PolymorphicTest {

	public static void main(String[] args) {
		Shape shape1;
		
		Square sq1 = new Square(5.0);
		
		Circle cir1 = new Circle(5.0); 
		
		
		shape1 = sq1;
		
		shape1.area();
		
		shape1 = cir1;
		
		shape1.area();

	}

}
