
public class StaticDemo {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		A a2 = new A();
		
		System.out.println("a1.x ="+ a1.x);
		System.out.println("a2.x ="+ a2.x);
		
		System.out.println("a1.y ="+ a1.y);
		System.out.println("a2.y ="+ a2.y);
		
		a1.x = 200;
		
		System.out.println("a1.x ="+ a1.x); //??
		System.out.println("a2.x ="+ a2.x); // ?? 
		
		a1.y =  525;
		
		System.out.println("a1.y ="+ a1.y);//??
		System.out.println("a2.y ="+ a2.y);//??

	}

}


class A{
	int x=100;
	
	static int y=500;
	
}