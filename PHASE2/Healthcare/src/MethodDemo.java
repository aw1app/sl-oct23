
public class MethodDemo {

	public static void main(String[] args) {
		
		double price1 = 100;
		int quantity1=5;
		
		double result1 = calculateBill(price1,quantity1 );
		
		System.out.println(result1);
		
		
		double price2 = 200;
		int quantity2=6;
		
		double result2 = calculateBill(price2,quantity2 );
		System.out.println(result2);
		
		
		Doctor d1 = new Doctor();
		int visitCount = 15;
		double totalCharges = d1.calculateBill(visitCount);
		System.out.println("Doctor d1 charges " + totalCharges +  " for " + visitCount + " visits.");

	}

	public static double calculateBill(double price, int quantity) {
		return price*quantity;
	}

}
