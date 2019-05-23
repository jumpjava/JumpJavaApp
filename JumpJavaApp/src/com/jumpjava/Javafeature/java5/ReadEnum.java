
/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : Enum Example in JAVA
 * */
package com.jumpjava.Javafeature.java5;

public class ReadEnum {

	public static void main(String[] args) {

		/* To Access the Value from Enum */
		String server_Name = Enum.FTP_SERVER.getString_action();
		String server_Path = Enum.FTP_PATH.getString_action();
		String server_User = Enum.FTP_USER.getString_action();
		String local_Path = Enum.LOCAL_PATH.getString_action();

		String csv_type = Enum.CSV_TYPE.getString_action();
		String xlsx_type = Enum.XLSX_TYPE.getString_action();
		String jpg_type = Enum.JPG_TYPE.getString_action();
		String txt_type = Enum.TXT_TYPE.getString_action();

		System.out.println("Server Name -> " + server_Name);
		System.out.println("Server Path -> " + server_Path);
		System.out.println("Server User -> " + server_User);
		System.out.println("Local path -> " + local_Path);
		System.out.println("CSV Type -> " + csv_type);
		System.out.println("XLSX Type -> " + xlsx_type);
		System.out.println("JPG Type ->" + jpg_type);
		System.out.println("Text Type ->" + txt_type);

	}

}
