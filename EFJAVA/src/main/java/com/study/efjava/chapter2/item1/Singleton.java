package com.study.efjava.chapter2.item1;

/**
 * 장점 2 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
 */
public class Singleton {
	private static Singleton instance;

	private Singleton(){}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
