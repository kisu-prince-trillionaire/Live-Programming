package com.demo.string;

public class StringBufferExample {

	public static void main(String[] args) {
//		String s = "Hello";
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		sb.insert(1, " java ");// now original string is changed
		System.out.println(sb);// prints HJavaello

		sb.replace(1, 3, " Java ");
		System.out.println(sb);// prints HJavalo

		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo

		sb.reverse();
		System.out.println(sb);// prints olleH

		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
	}

}
