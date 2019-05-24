/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Annotation Example in JAVA
 * */
package com.jumpjava.Javafeature.java5;

import java.util.ArrayList;
import java.util.List;

class Parent {

	public void display() {
		System.out.println("I am from parent Class");
	}

}

public class AnnotationExample extends Parent {

	public static void main(String[] args) {

		AnnotationExample example = new AnnotationExample();
		
		example.display();
		example.getListElement();
		example.noUse();
		
	}
	
	
	/*@Override Annotation Example*/
	@Override
	public void display() {
		System.out.println("I am from Child Class");
	}

	
	/*@SuppressWarnings Annotation Example*/
	@SuppressWarnings("unchecked")
	public void getListElement() {

		@SuppressWarnings("rawtypes")
		List l = new ArrayList();
		l.add(1);
		l.add("JUMP JAVA");
		l.add(1.0);

		for (Object value : l) {
			System.out.println(value);
		}

	}
	
	/*@Deprecated Annotation Example*/
	@Deprecated
	public void noUse() {
		System.out.println("I am no longer considered ");
	}
}
