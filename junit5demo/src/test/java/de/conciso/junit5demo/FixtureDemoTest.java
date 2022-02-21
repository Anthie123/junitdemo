package de.conciso.junit5demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


public class FixtureDemoTest {

    public FixtureDemoTest() {
        System.out.println("Constructor");
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("BeforeAll");
    }
    @AfterAll
    public static void tearDownClass() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach");
    }
    @Test
    public void testMethod1() {
        System.out.println("Dies ist der erste Test");
    }

    @Test
    @DisplayName("dies ist ein Test")
    public void testMethod2() {
        System.out.println("Dies ist der zweite Test");
    }

    @Disabled
    @Test
    public void testMethod3() {
        System.out.println("Dies ist der disabled Test");
    }

    @Disabled("Dieser Test is deaktiviert")
    @Test
    public void testMethod4() {
        System.out.println("Dies ist der disabled Test");
    }

    @Test
    public void test_Method_5() {
        System.out.println("Dies ist der vierte Test");
    }

}
