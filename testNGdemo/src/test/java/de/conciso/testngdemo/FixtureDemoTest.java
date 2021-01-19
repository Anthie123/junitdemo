package de.conciso.testngdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FixtureDemoTest {

  public FixtureDemoTest() {
    System.out.println("Constructor");
  }

  @BeforeClass
  public static void setUpClass() {
    System.out.println("BeforeClass");
  }

  @AfterClass
  public static void tearDownClass() {
    System.out.println("AfterClass");
  }

  @BeforeGroups(groups = {"myGroup"})
  public void setUpGroups() {
    System.out.println("BeforeGroups");
  }

  @AfterGroups(groups = {"myGroup"})
  public void tearDwonGroups() {
    System.out.println("AfterGroups");
  }

  @BeforeMethod()
  public void setUp() {
    System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void tearDown() {
    System.out.println("AfterMethod");
  }

  @Test
  public void testMethod1() {
    System.out.println("Dies ist der erste Test");
  }

  @Test
  public void testMethod2() {
    System.out.println("Dies ist der zweite Test");
  }

  @Test(enabled = false)
  public void testMethod3() {
    System.out.println("Dies ist der ignored Test");
  }

  @Test(groups = {"myGroup"})
  public void testMethod4() {
    System.out.println("Dies ist der group Test");
  }

}
