package com.study.efjava.chapter2.item1;
interface javaBook{}
class God_of_java implements javaBook {}
class EF_java implements javaBook{}

/**
 * 장점 3. 반환 타입의 하위 타입 객체를 반환할 수 있다.
 */
public class javaBooks {
	public static javaBook forBeginner() {
		return new God_of_java();
	}

	public static javaBook forIntermediate() {
		return new EF_java();
	}
}
