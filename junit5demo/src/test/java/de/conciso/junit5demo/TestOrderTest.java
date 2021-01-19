package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodName.class)
public class TestOrderTest {

    @Test
    public void atest() {
        assertTrue(true);
    }

    @Test
    public void dtest() {
        assertTrue(true);
    }

     @Test
    public void ctest() {
        assertTrue(true);
    }

    @Test
    public void btest() {
        assertTrue(true);
    }

    @Test
    public void etest() {
        assertTrue(true);
    }
}
