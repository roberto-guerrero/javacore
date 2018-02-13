package com.HashEquals;

public class HashEqualsMain {

	public static void main(String[] args) {
		User user1 = new User("Roberto", 34);
		User user2 = new User("Roberto", 34);
		
		System.out.println(user1.equals(user2));
	}

}
