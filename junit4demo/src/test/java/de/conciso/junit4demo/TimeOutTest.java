package de.conciso.junit4demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;

public class TimeOutTest {

    @Rule
    public Timeout timeOut = Timeout.millis(500);

//    @Test(timeout = 100)
//    public void testTimeOut() throws InterruptedException {
//        Thread.sleep(1000);
//    }

    @Test
    public void testTimeOutWithRule() throws InterruptedException {
        Thread.sleep(1000);
    }
}
