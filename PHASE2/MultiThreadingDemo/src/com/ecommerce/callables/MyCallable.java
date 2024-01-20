package com.ecommerce.callables;

import java.util.concurrent.Callable;

class MyCallable implements Callable<String> {
	
	@Override
	public String call() throws Exception {
		// Simulate some time-consuming operation
		for (int i = 0; i < 10; i++) {
			System.out.printf("[In I-Loop %s ] %s, please report to the reception \n",
					Thread.currentThread().getName(), i);
			
			try {Thread.sleep(10);} catch (Exception e) {};

		}
		
		return "Hello World. my task completed!";
	}
	
	
}
