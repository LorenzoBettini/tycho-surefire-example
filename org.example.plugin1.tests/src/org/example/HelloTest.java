package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		assertEquals("Hello", new Hello().message());
	}

}
