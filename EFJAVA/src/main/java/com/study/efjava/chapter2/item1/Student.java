package com.study.efjava.chapter2.item1;

import lombok.Getter;

/**
 * 팩토리 메서드 장점 1
 * 생성 목적에 따른 이름 표현이 가능하다
 */
@Getter
public class Student {
	private String name;
	private String school;

	private Student(String name, String school) {
		this.name = name;
		this.school = school;
	}

	public static Student schoolSSAFYFrom(String name) {
		return new Student(name, "SSAFY");
	}

	public static Student of(String name, String school) {
		return new Student(name, school);
	}
}
