package com.demo.string;

public class Test {

	public static void main(String[] args) {
		String[] lines = {"apple", "ape", "april"};

		String result = "";
		char temp;
		for (int i = 0; i < lines.length-1; i++) {
			temp = lines[0].charAt(i);
			for (int j = 1; j < lines.length-1; j++) {
				if (lines[j].charAt(i) != temp)
					break;
			}
			result += (temp);
		}
		System.out.println("The longest prefix is : " + result);
	}

}

//Time Complexity : O(n^2)
//Time taken : 35mins
