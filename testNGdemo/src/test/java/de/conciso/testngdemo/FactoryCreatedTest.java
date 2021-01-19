package de.conciso.testngdemo;

import org.testng.annotations.Test;

public class FactoryCreatedTest {

  private final int number;

  public FactoryCreatedTest(int i) {
    this.number = i;
  }
  @Test
  public void test() {
    System.out.println(number);
  }
}
