package com.MutableInmutable;

public class MutableInmutableMain {
	public static void main(String[] args) {
		
		System.out.println("Hello!");
		
		Mutable mutable = new Mutable("Roberto");
		System.out.println(mutable.getName());
		
		mutable.setName("Daniel");
		System.out.println(mutable.getName());
		
		
		Inmutable inmutable = new Inmutable("Diana");
		System.out.println(inmutable.getName());
		
		//There is no way to change the name as the class is final and no setter method available
	}	
}