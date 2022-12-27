package com.demo.string;

public class StringMethodsExample {

	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

		System.out.println(s.trim());// Sachin

		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true

		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h

		System.out.println(s.length());// 6

		String s1 = new String("Sachin");
		String s2 = s1.intern();
		System.out.println(s2);// Sachin

		int a = 10;
		String s3 = String.valueOf(a);
		System.out.println(s3 + 10);

		String s4 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s4.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);
	}

}
