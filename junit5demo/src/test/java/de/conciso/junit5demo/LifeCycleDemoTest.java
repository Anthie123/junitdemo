package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_METHOD)
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleDemoTest {
	private int counter = 0;
	
	@Test
	void incrementCounter() {
		System.out.printf("Counter = %d\n", counter);
		counter += 2;
	}

	@Test
	void incrementCounterSecondTime() {
		System.out.printf("Counter = %d\n", counter);
		counter += 2;
	}

}
