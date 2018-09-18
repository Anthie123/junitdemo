package de.conciso.junit4demo;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
