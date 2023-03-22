package com.spring.boot.local.other;

import java.util.function.Consumer;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		test(TestEntity::doSomething);
	}

	static void test(Consumer<TestEntity> consumer) {
		TestEntity entity = new TestEntity("yoyo", "hyy");
		consumer.accept(entity);
	}
}

class TestEntity {

	public TestEntity(String name, String value) {
		this.name = "My name is " + name;
		this.value = "My value is " + value;
	}

	private final String name;
	private final String value;

	void doSomething() {
		System.out.println(this.name);
		System.out.println(this.value);
	}

}
