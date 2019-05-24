/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Covariant Return Type Example in JAVA
 * */

package com.jumpjava.Javafeature.java5;

public class ParentClass {

	public static String getMeString() {

		System.out.println("I am from ParentClass String getMeString");
		return "I am String";
	}

	public static Object getMeObject() {

		ParentClass parentClass = null;
		System.out.println("I am from ParentClass Stating getMeObject");
		return parentClass;
	}

	public static Number getMeNumber() {

		System.out.println("I am from ParentClass Stating getMeNumber");
		return 1;

	}

}
