package com.study.efjava.chapter2.Item3;

import java.io.Serializable;

public class Singleton1 implements Serializable {
	// 멀티 스레딩에 안전
	// 객체 사용 시점과 적재 시점이 달라 메모리 낭비 발생 가능
	private static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {}

	public static Singleton1 getInstance() {
		return INSTANCE;
	}

	/**
	 * 정적 팩터리든 private든 이렇게 만든 싱클턴 클래스 직렬화 할려면
	 *
	 * Serializable 구현 + 모든 인스턴스 필드 transient 선언, readResolver 제공
	 *
	 * 아니면 역직렬화 할때마다 새로운 인스턴스가 만들어진다
	 * @return 싱글톤 객체
	 */
	protected Object readResolver() {
		return INSTANCE;
	}
}
