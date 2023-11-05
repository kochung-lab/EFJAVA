package com.study.efjava.chapter2.Item5;

/**
 * 인스턴스를 생성할 때 생성자에 필요한 자원을 넘겨주는 방식
 */
public class SpellChecker {
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = dictionary;
	}
}
