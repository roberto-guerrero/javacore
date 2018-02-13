package com.Threads;

public class PrintCount {
	public void printCount() {
		for (int i=5; i>0; i--) {
			System.out.println("Running " + Thread.currentThread().getName() + ", Count: " + i);
		}
		System.out.println("Endning " + Thread.currentThread().getName());
	}
}
