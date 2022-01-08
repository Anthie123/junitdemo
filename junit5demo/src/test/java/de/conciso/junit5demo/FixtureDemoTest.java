package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
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

    @Test
    public void test_Method_4() {
        System.out.println("Dies ist der vierte Test");
    }

}
