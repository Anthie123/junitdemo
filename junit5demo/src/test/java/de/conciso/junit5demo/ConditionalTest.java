package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTest {
    @EnabledOnOs(OS.WINDOWS)
    @Test
    public void testOnWindows() {
        assertTrue(true);
    }

    @EnabledOnOs(OS.MAC)
    @Test
    public void testOnMax() {
        assertTrue(false);
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    public void runOnJava8() {
        assertTrue(true);
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    public void testOnJre11() {
        assertTrue(false);
    }
}
