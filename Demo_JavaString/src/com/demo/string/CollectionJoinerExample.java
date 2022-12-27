package com.demo.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionJoinerExample {

	public static void main(String[] args) {
		List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); // List of String array
		String str = liststr.stream().collect(Collectors.joining(", ")); // performs joining operation
		System.out.println(str.toString()); // Displays result
	}

}
