/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Generic example.
 * */
package com.jumpjava.Javafeature.java5;

import java.util.HashSet;
import java.util.Set;

public class GenericExample {

	public static void main(String[] args) {

		GenericExample.getRawTypeGeneric();
		Set<String> setElement = null;
		GenericExample.getFormalGeneric(setElement);
	}

	public static void getRawTypeGeneric() {
		System.out.println("*Start-Raw Type Generic");
		Set setElement = new HashSet();
		setElement.add(1);
		setElement.add("Jump JAVA");

		for (Object value : setElement) {
			System.out.println(value);
		}
		System.out.println("*End-Raw Type Generic" + "\n");
	}

	public static void getFormalGeneric(Set<String> setElement) {
		System.out.println("*Start-formal parameter Type Generic");
		setElement = new HashSet<String>();
		setElement.add(" Jump ");
		setElement.add(" JAVA ");

		for (Object value : setElement) {
			System.out.println(value);
		}
		System.out.println("*End-formal parameter Type Generic" + "\n");
	}

}
