/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 8.Write a Java program to compare a given string to the specified character sequence.
 * */
package com.jumpjava.String;

public class CompareStringToTheSpecifiedCharacterSequence {

	public static void main(String[] args) {

		String str = "https://jumpjava.wordpress.com"; 
	    CharSequence sequence = "https://jumpjava.Wordpress.com";
		
	    CompareStringToTheSpecifiedCharacterSequence.getCompareStringToTheSpecifiedCharacterSequence(str, sequence);
	    
	}

	
	public static void getCompareStringToTheSpecifiedCharacterSequence(String str,CharSequence sequence){
		
		System.out.println("Comparing "+"\n"+str+"\n"+ "and "+"\n"+sequence+"\n"+"Result : " + str.contentEquals(sequence));
	}
}
