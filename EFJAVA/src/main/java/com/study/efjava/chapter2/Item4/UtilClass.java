package com.study.efjava.chapter2.Item4;

public class UtilClass {
	private UtilClass() {
		throw new AssertionError("유틸 클래스의 생성자를 만들지 마세요");
	}
	static void print() {
		System.out.println("스테틱 메서드");
	}
}
