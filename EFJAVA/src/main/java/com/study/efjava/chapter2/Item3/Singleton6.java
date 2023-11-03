package com.study.efjava.chapter2.Item3;

public class Singleton6 {
	private static volatile Singleton6 INSTANCE;

	private Singleton6() {}
	// Double-Checked Locking
	private static Singleton6 getInstance() {
		// 최초 초기화만 동기화 리소스 낭비 줄인다
		if (INSTANCE == null) {
			synchronized (Singleton6.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton6();
				}
			}
		}
		return INSTANCE;
	}
}
