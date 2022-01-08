package de.conciso.junit5demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.fail;

public class TimeOutTest {
    @Test
    public void testTimeOutInSameThread() {
        assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(1000));
    }
    @Test
    public void testTimeOutInDifferentThread () {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> Thread.sleep(1000));
    }
    
    @Test
    @Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
    void testTimeOutWithAnnotation() throws InterruptedException {
    	Thread.sleep(100);
    	fail();
    }
}
