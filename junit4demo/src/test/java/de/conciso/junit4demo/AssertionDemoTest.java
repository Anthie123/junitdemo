package de.conciso.junit4demo;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class AssertionDemoTest {
    @Test
    public void testMoeglicheStandardAssertions() {

        assertTrue(true);
        assertEquals(1, 1);
        assertFalse(false);
        assertNotEquals(1, 2);
        assertNotSame(new Object(), new Object());
        assertNotNull(new Object());
        assertNull(null);
        Object object = new Object();
        assertSame(object, object);
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        // Hamcrest Unterstützung
        assertThat(true, CoreMatchers.is(true));
    }

    @Test
    public void testMeldungenVonAsserts() {
        assertTrue("Dies sollte true ergeben", false);
    }

}
