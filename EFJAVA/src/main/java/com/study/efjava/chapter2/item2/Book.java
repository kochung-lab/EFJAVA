package com.study.efjava.chapter2.item2;

import lombok.Getter;

@Getter
class Book {
	private String name;
	private Integer price;
	private String type;

	public Book (String name, Integer price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
}
