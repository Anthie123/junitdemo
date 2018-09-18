package de.conciso.junit5demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TagTest {

    @Tag("fast")
    @Test
    public void atest() {
        assertTrue(true);
    }

    @Tag("slow")
    @Test
    public void dtest() {
        assertTrue(true);
    }

    @Tag("fast")
    @Test
    public void ctest() {
        assertTrue(true);
    }

    @Tag("slow")
    @Test
    public void btest() {
        assertTrue(true);
    }

    @Test
    public void etest() {
        assertTrue(true);
    }
}
