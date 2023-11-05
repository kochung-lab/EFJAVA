package com.study.efjava.chapter2.Item6;

public class Plus {
	private Plus() {
		throw new AssertionError();
	}
	public static long sumLong() {
		long start = System.currentTimeMillis();
		Long sum = 0L;
		for (long i=0; i<=Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return System.currentTimeMillis() - start;
	}

	public static long sumlong() {
		long start = System.currentTimeMillis();
		long sum = 0L;
		for (long i=0; i<=Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return System.currentTimeMillis() - start;
	}
}
