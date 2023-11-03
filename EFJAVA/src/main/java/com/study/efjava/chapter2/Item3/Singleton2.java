package com.study.efjava.chapter2.Item3;

public enum Singleton2 {
	// 직렬화 할 수 있고, 리플렉션 방어
	// Enum 외 상속해야한다면 이 방법은 불가
	INSTANCE;

	public Singleton2 getInstance(){
		return INSTANCE;
	}
}
