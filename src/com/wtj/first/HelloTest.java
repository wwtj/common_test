package com.wtj.first;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testHello() {
		Hello hello = new Hello();
		assertEquals(hello.sayHello("taozi"), "Hello taozi");
	}
}
