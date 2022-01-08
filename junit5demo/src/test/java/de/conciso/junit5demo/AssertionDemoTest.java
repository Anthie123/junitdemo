package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

public class AssertionDemoTest {
    @Test
    public void testMoeglicheStandardAssertions() {

        // Allgemeine Möglichkeiten
        assertTrue(true);
        assertTrue(() -> true);
        assertTrue(() -> true, "Lambda gibt nicht true zurück");
        
        assertEquals(1, 1);
        assertFalse(false);
        assertNotEquals(1, 2);
        assertNotSame(new Object(), new Object());
        assertNotNull(new Object());
        assertNull(null);
        Object object = new Object();
        assertSame(object, object);
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
        });
        assertDoesNotThrow(() -> {
        });

        assertIterableEquals(Arrays.asList("Test1", "Test2"), Arrays.asList("Test1", "Test2"));

        assertLinesMatch(Arrays.asList("Test\\d", ".*", "\\w+\\d+"), Arrays.asList("Test1", "Test2", "Test3"));

        assertLinesMatch(Arrays.asList("Test\\d", ">> 2 >>", "\\w+\\d+"),
                Arrays.asList("Test1", "Test2", "Test3", "Test4"));
        
        assertInstanceOf(Boolean.class, Boolean.FALSE);
        
        assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(1));

        assertTimeoutPreemptively(Duration.ofMillis(10), () -> Thread.sleep(1));
    }

    @Test
    public void testGruppierungVonAssertions() {
        assertAll("Alles falsch",
                () -> assertTrue(false, "Dies sollte true ergeben"),
                () -> assertTrue(() -> false, () -> "Dies sollte auch true ergeben"));
    }

}
