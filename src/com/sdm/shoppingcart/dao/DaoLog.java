package com.sdm.shoppingcart.dao;

public class DaoLog {
	public static void log(String msg, Object obj) {
		System.out.println(msg);
		System.out.println("    " + obj.toString());
		System.out.println();
	}
}
