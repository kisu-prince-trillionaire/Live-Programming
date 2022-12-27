package com.demo.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello"); // String 1
		StringBuilder s2 = new StringBuilder(" World"); // String 2
		StringBuilder s3 = s1.append(s2); // String 3 to store the result
		System.out.println(s3.toString()); // Displays result

		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello

		sb.replace(1, 3, "Java");
		System.out.println(sb);// prints HJavalo

		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo

		sb.reverse();
		System.out.println(sb);// prints olleH

		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
	}

}
