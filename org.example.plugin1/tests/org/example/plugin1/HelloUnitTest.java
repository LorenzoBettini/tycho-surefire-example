package org.example.plugin1;

import static org.junit.Assert.assertEquals;

import org.example.Hello;
import org.junit.Test;

public class HelloUnitTest {

	@Test
	public void test() {
		assertEquals("Hello", new Hello().message());
	}

}
