package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeOutTest {
    @Test
    public void testTimeOutInSameThread() {
        assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(1000));
    }
    @Test
    public void testTimeOutInDifferentThread () {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> Thread.sleep(1000));
    }
}
