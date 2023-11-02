package com.study.efjava.chapter2.item2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Item2 생성자에 매개변수가 많다면 빌더를 고려하라")
class BookTest {
	@Test
	void 빌더테스트() {
		Book book1 = new BookBuilder()
			.name("이펙티브자바")
			.price(23000)
			.type("IT")
			.build();

		assertEquals("이펙티브자바", book1.getName());
	}
	@Test
	void 매개_변수_순서를_바꿔도_된다() {
		Book book1 = new BookBuilder()
			.price(23000)
			.type("IT")
			.name("이펙티브자바")
			.build();
		assertEquals("이펙티브자바", book1.getName());
	}
	@Test
	void 매개_변수를_빼도_된다() {
		Book book1 = new BookBuilder()
			.price(23000)
			.name("이펙티브자바")
			.build();
		assertEquals("이펙티브자바", book1.getName());
	}
}
