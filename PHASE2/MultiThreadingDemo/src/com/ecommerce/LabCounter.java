package com.ecommerce;

public class LabCounter implements Runnable{
	
	@Override
	public void run() {
		

		// This thread's job. let's say is to print 1 to 10
		// which the token numbers of the patients waiting

		for (int i = 0; i < 10; i++) {
			System.out.printf("[%s ] Calling Patient No %s, please report to the LAB \n",Thread.currentThread().getName(), i );
			
		}

	}

}
