package com.ecommerce;

public class AppMain {

	public static void main(String[] args) {
		System.out.println(" Current thread executing on the CPU is :  "+ Thread.currentThread().getName());
		
		Doctor doctor = new Doctor(1, "Sundar", 25);
		
		FrontDeskCounter counter1 = new FrontDeskCounter(doctor);
		counter1.setName("FO counter 1");
		
		counter1.start();
		
		FrontDeskCounter counter2 = new FrontDeskCounter(doctor);
		counter2.setName("FO counter 2");
		
		counter2.start();
		
//		LabCounter labCounterObj1 = new LabCounter();
//		Thread labCounter1 = new Thread(labCounterObj1);
//		labCounter1.setName("Lab counter 1");
//		labCounter1.start();
				
		
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("Inside main thread i=%s \n", i );			
//		}
		
		
	}

}
