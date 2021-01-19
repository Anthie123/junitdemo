package de.conciso.testngdemo;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;


public class TestOrderTest {

    @Test
    public void atest() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "ctest")
    public void dtest() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "btest")
    public void ctest() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "atest")
    public void btest() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "dtest")
    public void etest() {
        assertTrue(true);
    }
}
