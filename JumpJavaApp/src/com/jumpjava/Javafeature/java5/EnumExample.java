package com.jumpjava.Javafeature.java5;

public enum EnumExample {

	SERVER("10.1.1.10"), USER_NAME("myUser"), PASSWORD("myPassword");
	
	public final String label;

	private EnumExample(String label) {
		this.label = label;
	}

}
