/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Auto Boxing and Un-boxing Example in JAVA
 * */

package com.jumpjava.Javafeature.java5;

public class Autoboxing_UnboxingExample {

	public static void main(String[] args) {

		/* Do Automatic Conversion */
		Autoboxing_UnboxingExample.doAutoBoxing();
		Autoboxing_UnboxingExample.doUnBoxing();
	}

	public static void doAutoBoxing() {

		/* Now this is Primitive data type */
		int a = 50;

		/* Now this Primitive data type got promoted to Integer Wrapper Class */
		Integer a2 = new Integer(a);
		System.out.println(a2);
	}

	public static void doUnBoxing() {

		/* Now this is Integer Wrapper Class type */
		Integer i = new Integer(50);

		/* Now this Integer Wrapper Class type got demoted to Primitive data */
		int a = i;

		System.out.println(a);

	}
}
