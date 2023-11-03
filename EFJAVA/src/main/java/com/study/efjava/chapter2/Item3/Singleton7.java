package com.study.efjava.chapter2.Item3;
// 멀티 쓰레딩에도 안전 하고 레이지 로딩 방식
// 클래스 안에 내부 클래스가 있어 jvm 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법
// 다만 직렬화, 역질렬화로 싱글톤 파괴 가능, 리플렉션 으로도 그렇다
public class Singleton7 {
	private Singleton7() {}
	private static class Singleton7Holder {
		private static final Singleton7 INSTANCE = new Singleton7();
	}

	public static Singleton7 getInstance() {
		return Singleton7Holder.INSTANCE;
	}
}
