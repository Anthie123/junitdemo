package de.conciso.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void testExceptionViaAnnotation() {
        throw new RuntimeException();
    }

    @Test
    public void testExceptionClassical() {
        try {
            if (true) {
                throw new RuntimeException();
            }
            Assert.fail("Exception is missing");
        } catch (RuntimeException rte) {
            // assert what ever needed
        }
    }
}
