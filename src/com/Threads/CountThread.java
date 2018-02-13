package com.Threads;

public class CountThread extends Thread {
	String threadName;
	PrintCount pc;
	
	CountThread(String threadName, PrintCount pc) {
		this.threadName = threadName;
		this.pc = pc;
	}
	
	@Override
	public void run() {
		System.out.println("Starting " + Thread.currentThread().getName());
		synchronized (pc) {
			pc.printCount();
		}
	}
}
