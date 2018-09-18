package de.conciso.junit4demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class AssumptionDemoTest {

    @Test
    public void testValidAssumption() {
        Assume.assumeFalse(false);
        Assume.assumeNoException(null);
        Assume.assumeNotNull(new Object());
        Assume.assumeTrue(true);
        Assume.assumeThat(true, CoreMatchers.is(true));

        Assert.assertTrue(true);
    }

    @Test
    public void testInValidAssumption() {
        Assume.assumeThat(true, CoreMatchers.is(false));

        Assert.assertTrue(false);
    }

}
