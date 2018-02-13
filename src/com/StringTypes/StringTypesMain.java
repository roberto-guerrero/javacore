package com.StringTypes;

public class StringTypesMain {
	
	public static void concat(String s1) {
		s1 = s1 + " Daniel";
	}
	
	public static void concat(StringBuilder s1) {
		s1 = s1.append(" Daniel");
	}
	
	public static void concat(StringBuffer s1) {
		s1 = s1.append(" Daniel");
	}
	

	public static void main(String[] args) {
		String str = "Roberto";
		concat(str);
		System.out.println(str);
		
		StringBuilder strBld = new StringBuilder("Roberto");
		concat(strBld);
		System.out.println(strBld);

		StringBuffer strBfr = new StringBuffer("Roberto");
		concat(strBfr);
		System.out.println(strBfr);
	}

}
