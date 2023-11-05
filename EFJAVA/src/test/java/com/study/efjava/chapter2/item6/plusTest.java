package com.study.efjava.chapter2.item6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.study.efjava.chapter2.Item6.Plus;

@DisplayName("불필요한 객체 생성을 피해라")
public class plusTest {
	@Test
	void long_Long_더하기_테스트() {
		assertTrue(Plus.sumlong() < Plus.sumLong());
	}
}
