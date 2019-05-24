/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Covariant Return Type Example in JAVA
 * */

package com.jumpjava.Javafeature.java5;

public class CovariantReturnTypeExample extends ParentClass {

	public static void main(String[] args) {

		String str = CovariantReturnTypeExample.getMeObject();
		System.out.println(str+"\n");
		String str1 = CovariantReturnTypeExample.getMeString();
		System.out.println(str1+"\n");
		float f = CovariantReturnTypeExample.getMeNumber();
		System.out.println(f+"\n");

	}

	public static String getMeObject() {

		System.out.println("I am from ChildClass state getMeObject");
		return "I am String";
	}

	public static Float getMeNumber() {
		System.out.println("I am from ChildClass Stating getMeNumber");
		return 1.0F;

	}

}
