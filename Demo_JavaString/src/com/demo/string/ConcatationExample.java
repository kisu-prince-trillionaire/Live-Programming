package com.demo.string;

public class ConcatationExample {

	public static void main(String[] args) {
		String s = "Sachin" + " Tendulkar";
		System.out.println(s);// Sachin Tendulkar

		String s1 = (new StringBuilder()).append("Sachin").append(" Tendulkar").toString();
		System.out.println(s1);

		String s2 = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s2);// 80Sachin4040
	}

}
