package org.example.plugin1;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Hello;
import org.junit.jupiter.api.Test;

class HelloUnitTest {

	@Test
	void test() {
		assertEquals("Hello", new Hello().message());
	}

}
