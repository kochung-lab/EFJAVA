package com.study.efjava.chapter2.item4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.study.efjava.chapter2.Item3.Singleton7;

public class Singleton7Test {
	@Test
	@DisplayName("쓰레드 세이프 테스트")
	void Singleton7() {
		ArrayList<Singleton7> arr = new ArrayList<>();

		ExecutorService threadPool = Executors.newCachedThreadPool();

		for (int i=0; i<= 10000; i++) {
			threadPool.submit(
				() -> arr.add(Singleton7.getInstance())
			);
		}

		assertEquals(arr.get(arr.size()-1).hashCode(), arr.get(0).hashCode());
	}
}
