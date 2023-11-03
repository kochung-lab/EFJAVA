package com.study.efjava.chapter2.Item3;

public class Singleton5 {
	private static Singleton5 INSTANCE;
	private Singleton5 () {}

	private static synchronized Singleton5 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton5();
		}
		return INSTANCE;
	}
}
