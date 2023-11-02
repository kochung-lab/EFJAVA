package com.study.efjava.chapter2.item2;

public class BookBuilder {
	private String name;
	private Integer price;
	private String type;
	// In the builder: A 'setter'-like method for each parameter of the target
	public BookBuilder name(String name) {
		this.name = name;
		return this;
	}

	public BookBuilder price(Integer price) {
		this.price = price;
		return this;
	}

	public BookBuilder type(String type) {
		this.type = type;
		return this;
	}

	public Book build() {
		return new Book(name, price, type);
	}
}
