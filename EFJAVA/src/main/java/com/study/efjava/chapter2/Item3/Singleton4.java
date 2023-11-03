package com.study.efjava.chapter2.Item3;

public class Singleton4 {
	private static Singleton4 INSTANCE;

	private Singleton4() {}
	// 래이지 생성
	// 객체 생성을 메서드 내부적으로 처리
	// 미사용 고정 메모리 단점 극복
	// 쓰레드 세이프 하지 않음

	public static Singleton4 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton4();
		}
		return INSTANCE;
	}
}
