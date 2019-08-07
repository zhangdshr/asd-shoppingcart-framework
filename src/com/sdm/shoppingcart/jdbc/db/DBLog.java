package com.sdm.shoppingcart.jdbc.db;

public class DBLog {
	public static void log(String msg, Object obj) {
		System.out.println(msg);
		System.out.println("    " + obj.toString());
		System.out.println();
	}
}
