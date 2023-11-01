package com.study.efjava.chapter2.item1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("빌더 패던 장점 1 테스트")
public class StudentTest {
	@Test
	void 이름만_등록할_시_학교는_싸피로_등록된다 () {
		Student student = Student.schoolSSAFYFrom("청천");
		assertEquals(student.getName(), "청천");
		assertEquals(student.getSchool(), "SSAFY");
	}

	@Test
	void 이름과_학교를_등록한다 () {
		Student student = Student.of("청천", "N");
		assertEquals(student.getName(), "청천");
		assertEquals(student.getSchool(), "N");
	}

	@Test
	void 주소값_테스트_서로_다른_객체() {
		Student student1 = Student.of("청천", "N");
		Student student2 = Student.of("청천", "N");
		assertNotEquals(student1.hashCode(), student2.hashCode());
	}
}
