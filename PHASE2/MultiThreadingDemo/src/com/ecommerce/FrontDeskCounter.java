package com.ecommerce;

public class FrontDeskCounter extends Thread {

	Doctor doctor;

	public FrontDeskCounter(Doctor d) {
		this.doctor = d;
	}

	@Override
	public void run() {

		// This thread's job. let's say is to print 1 to 10
		// which the token numbers of the patients waiting

		for (int i = 0; i < 10; i++) {
			System.out.printf("[In I-Loop %s ] Calling Patient No %s, please report to the reception \n",
					Thread.currentThread().getName(), i);
			
			try {Thread.sleep(10);} catch (Exception e) {};

		}

		// Only one thread can be
		// inside the synchronized block
		synchronized (doctor)

		{

			for (int j = 0; j < 10; j++) {
				System.out.printf("[In J Loop %s ] Calling Patient No %s, please report to the reception \n",
						Thread.currentThread().getName(), j);
				try {Thread.sleep(10);} catch (Exception e) {};
			}

		}

	}

}
