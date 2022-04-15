package org.example.plugin1;

import static org.junit.Assert.assertEquals;

import org.example.Hello;
import org.junit.Test;

public class HelloIT {

	@Test
	public void testIT() {
		assertEquals("Hello", new Hello().message());
	}

}
