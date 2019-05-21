package com.jumpjava.Javafeature.java5;

public class VarArgsExample {

	public static void main(String[] args) {

		System.out.println("Number Var-Arg Example");
		VarArgsExample.add(1);
		VarArgsExample.add(1, 2);
		VarArgsExample.add(1, 2, 3);
		System.out.println("String with Number Var-Arg Example");
		VarArgsExample.myAdd("JumpJAVA", 1);
		VarArgsExample.myAdd("JumpJAVA", 1, 2);
		VarArgsExample.myAdd("JumpJAVA", 1, 2, 3);
		VarArgsExample.myAdd("JumpJAVA", 1, 2, 3, 4);
		System.out.println("String with String Var-Arg Example");
		VarArgsExample.display("Jump");
		VarArgsExample.display("Jump", "JAVA");
		VarArgsExample.display("Jump", "JAVA", "Tutorial");
		System.out.println("String with String Var-Arg Example");
		VarArgsExample.myDisplay(1, "Jump");
		VarArgsExample.myDisplay(2, "Jump", "JAVA");
		VarArgsExample.myDisplay(3, "Jump", "JAVA", "Tutorial");

	}

	public static void add(int... value) {
		System.out.println("Number of arguments is: " + value.length);

		for (int i : value) {

			System.out.println(i + " ");
		}
	}

	public static void myAdd(String operation, int... number) {

		System.out.println("Number of arguments is: " + number.length);

		for (int i : number) {

			System.out.println(operation + " - " + i + " ");
		}

	}

	public static void display(String... operation) {

		System.out.println("Number of arguments is: " + operation.length);

		for (String value : operation) {
			System.out.println("String Value is->" + value);
		}
	}

	public static void myDisplay(int number, String... operation) {

		System.out.println("Number of arguments is: " + operation.length);

		for (String value : operation) {

			System.out.println(number + "-" + "String Value is->" + value);
		}
	}

}
