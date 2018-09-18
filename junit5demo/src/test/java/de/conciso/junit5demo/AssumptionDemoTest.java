package de.conciso.junit5demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemoTest {
    @Test
    public void testValidAssumption() {
        Assumptions.assumeTrue(true);
        Assumptions.assumingThat(true, () -> System.out.println("test"));

        Assertions.assertTrue(true);
    }

    @Test
    public void testInvalidAssumption() {
        Assumptions.assumeFalse(true);
        Assertions.assertTrue(false);
    }
}
