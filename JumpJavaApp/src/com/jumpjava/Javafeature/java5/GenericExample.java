package com.jumpjava.Javafeature.java5;

import java.util.HashSet;
import java.util.Set;

public class GenericExample {

	public static void main(String[] args) {

		GenericExample.getRawTypeGeneric();
		Set<String> setElement;
		GenericExample.getFormalGeneric();
	}

	public static void getRawTypeGeneric() {
		// Set
		System.out.println("*Start-Raw Type Generic");
		Set setElement = new HashSet();
		setElement.add(1);
		setElement.add("Jump JAVA");

		for (Object value : setElement) {
			System.out.println(value);
		}
		System.out.println("*End-Raw Type Generic");
	}

	public static void getFormalGeneric(Set<E> setElement) {
		// Set<E>Generic Type , E is called formal parameter
	    setElement = new HashSet<E>();
		setElement.add(1);
		setElement.add("Jump JAVA");

		for (Object value : setElement) {
			System.out.println(value);
		}

	}

	public static void getParametrizedGeneric() {
		// Set<Integer> Parametrized type , Integer is actual parameter here
	}

	public static void getBoundedParameterGeneric() {
		// <T extends Comparable>Bounded type parameter
	}

	public static void getUnBoundedWildcardGeneric() {
		// Set<?>Unbounded wildcard
	}

	public static void getBoundedWildcardTypeGeneric() {
		// <? extends T> Bounded wildcard type
	}

	public static void getRecursiveTypeBoundGeneric() {
		// <T extends Comparable<T>> Recursive type bound
	}

}
