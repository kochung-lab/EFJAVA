package com.study.efjava.chapter2.item1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SingletonTest {
	@Test
	void 객체가_여러개_생성되도_같은_주소_값을_가진다() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		assertEquals(true, singleton1.equals(singleton2));
		assertEquals(singleton1, singleton2);
	}
}
