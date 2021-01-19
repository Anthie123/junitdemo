package de.conciso.testngdemo;

import org.testng.annotations.Test;

public class ParallelAndTimeOutTest {

    @Test(threadPoolSize = 3, invocationCount = 9, timeOut = 3050)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(1000);
    }

}
