package com.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSamples {
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnableThread());
		t.start();
		
		
		Thread t2 = new MyExtendedThread();
		t2.start();
		
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		});
		executor.shutdown();
		
		
		PrintCount pc = new PrintCount();
		
		Thread thread2 = new CountThread("Thread - 2 ", pc);
		Thread thread3 = new CountThread("Thread - 3 ", pc);
		thread2.start();
		thread3.start();
		
	}
}