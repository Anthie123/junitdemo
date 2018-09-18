package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

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
    public void testExceptionWithAssertion() {
        final String msg = "MyMessage";
        RuntimeException rte = assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException(msg);
        });
        assertEquals(msg, rte.getMessage());
    }

    @Test
    public void testNoExceptionIsThrown() {
        assertDoesNotThrow(() -> {
            throw new RuntimeException();
        }, "This Exception is invalid");
    }

}
