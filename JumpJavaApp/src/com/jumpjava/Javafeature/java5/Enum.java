
/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Enum Example in JAVA
 * */

package com.jumpjava.Javafeature.java5;

public enum Enum {

	FTP_SERVER("10.1.2.3"), FTP_USER("sftp"), FTP_PASSWORD("myPassword"), FTP_PATH("/a/b/c"), LOCAL_PATH("/resource"),
	CSV_TYPE("csv"), XLSX_TYPE("xlsx"), JPG_TYPE("jpg"), TXT_TYPE("txt"), LOG_TYPE("log"), FTP_PORT(22),
	FTP_TIMEOUT(900000);

	private String string_action;

	private int int_action;

	public String getString_action() {
		return string_action;
	}

	public int getInt_action() {
		return int_action;
	}

	// enum constructor - cannot be public or protected
	private Enum(String action) {
		this.string_action = action;
	}

	private Enum(int action) {
		this.int_action = action;
	}

}
