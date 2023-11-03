package com.study.efjava.chapter2.item3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.study.efjava.chapter2.Item3.Singleton4;

public class Singleton4Test {
	@Test
	@DisplayName("멀티 스레싱에 안전하지 않다")
	void multi() {
		ArrayList<Singleton4> arr = new ArrayList<>();

		ExecutorService threadPool = Executors.newCachedThreadPool();

		for (int i=0; i<=10000; i++) {
			threadPool.submit(
				() -> arr.add(Singleton4.getInstance())
			);
		}

		assertNotEquals(arr.get(arr.size()-1).hashCode(), arr.get(0).hashCode());
	}
}
