package com.demo.string;

import java.util.Arrays;

public class SubstringExample {

	public static void main(String[] args) {
		String s = "SachinTendulkar";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(6));// Tendulkar
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Sachin

		String text = new String("Hello, My name is Sachin");
		/* Splits the sentence by the delimeter passed as an argument */
		String[] sentences = text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}

}
