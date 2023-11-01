package com.study.efjava.chapter2.item1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("반환 타입의 하위 타입 객체를 반환할 수 있다")
public class javaBooksTest {
	@Test
	void 서로_다른_타입_테스트() {
		javaBook classA = javaBooks.forIntermediate();
		javaBook classB = javaBooks.forBeginner();
		assertNotEquals(classA.getClass(), classB.getClass());
	}
}
