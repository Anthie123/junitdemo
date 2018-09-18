package de.conciso.junit4demo;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;

public class ExceptionTest {
    @Rule
    public ExpectedException catcher = ExpectedException.none();

    @Test(expected = RuntimeException.class)
    public void testExceptionViaAnnotation() {
        throw new RuntimeException();
    }

    @Test
    public void testExceptionClassical() {
        try {
            if (true) {
                throw new RuntimeException();
            }
            fail("Exception is missing");
        } catch (RuntimeException rte) {
            // assert what ever needed
        }
    }

    @Test
    public void testExceptionWithRule() {
        catcher.expect(RuntimeException.class);
        catcher.expectMessage("MyMessage");

        throw new RuntimeException();
    }
}
