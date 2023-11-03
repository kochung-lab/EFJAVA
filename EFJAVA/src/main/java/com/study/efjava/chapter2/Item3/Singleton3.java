package com.study.efjava.chapter2.Item3;

public class Singleton3 {
	// 여전히 static 때문에 사용하지 않는 공간 차지

	private static Singleton3 INSTANCE;

	private Singleton3() {}

	// static 으로 예외 잡을 수 있다
	// static block 은 클래스 로딩 되고 클래스 변수가 준비 된 후 실행
	static {
		try {
			INSTANCE = new Singleton3();
		} catch (Exception e) {
			throw new RuntimeException("싱글톤 객체는 하나만 생성해주세요");
		}
	}

	public static Singleton3 getInstance() {
		return INSTANCE;
	}
}
