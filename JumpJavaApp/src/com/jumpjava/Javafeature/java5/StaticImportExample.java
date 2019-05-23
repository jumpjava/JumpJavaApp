/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Static Import Exampe in Java
 * */

package com.jumpjava.Javafeature.java5;

import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class StaticImportExample {

	public static void main(String[] args) {

		StaticImportExample.makeStaticMath();
		StaticImportExample.makeStaticPrintf();
		StaticImportExample.makeStaticInteger();

	}

	public static void makeStaticMath() {

		/* Now no need of write Math.sqrt and all */

		System.out.println(sqrt(16));
		System.out.println(pow(4, 2));
		System.out.println(abs(10.3));
		System.out.println(ceil(125.9));
		System.out.println(ceil(0.4873));
	}

	public static void makeStaticPrintf() {

		/* Now no need of write System.out */

		out.println("Hello");
		out.println("Jump");
		out.println("JAVA");

	}

	public static void makeStaticInteger() {

		/* Now no need of write Integer.MIN_VALUE or Integer.MAX_VALUE */

		out.println("Without Static Import MAX Value of Integer" + MAX_VALUE);
		out.println("Without Static Import MAX Value of Integer" + MIN_VALUE);

	}

}
