package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelDemoTest {

	@Test
	@ResourceLock(value = Resources.SYSTEM_OUT, mode = ResourceAccessMode.READ_WRITE)
	void testWriteToSystem() {
		System.out.println("Test");
	}
	@Test
	@ResourceLock(value = Resources.SYSTEM_OUT, mode = ResourceAccessMode.READ_WRITE)
	void testWriteToSystemToo() {
		System.out.println("Test2");
	}
}
