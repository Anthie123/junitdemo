package de.conciso.testngdemo;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemoTest {

  @Test
  public void testMoeglicheStandardAssertions() {

    // Allgemeine Möglichkeiten
    Assert.assertTrue(true);

    Assert.assertEquals(1, 1);
    Assert.assertFalse(false);
    Assert.assertNotEquals(1, 2);
    Assert.assertNotSame(new Object(), new Object());
    Assert.assertNotNull(new Object());
    Assert.assertNull(null);
    Object object = new Object();
    Assert.assertSame(object, object);

    Assert.assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    Assert.assertEquals(Arrays.asList("Test1", "Test2"), Arrays.asList("Test1", "Test2"));
    Assert.assertEqualsNoOrder(new String[]{"Test1", "Test2"}, new String[]{"Test2", "Test1"});
  }

  @Test
  public void testMeldungenVonAsserts() {
    assertTrue("Dies sollte true ergeben", false);
  }

}
