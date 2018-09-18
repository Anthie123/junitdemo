package de.conciso.junit5demo;

import org.junit.jupiter.api.*;

@DisplayName("My Injection Test")
public class InjectionTest {

    public InjectionTest(TestInfo info) {
        System.out.println("Constructor: " + info.toString());
    }

    @BeforeAll
    public static void setUpClass(TestInfo info) {
        System.out.println("BeforeAll: " + info.toString());
    }

    @BeforeEach
    public void setUp(TestInfo info) {
        System.out.println("BeforeEach: " + info.toString());
    }


    @AfterEach
    public void tearDown(TestInfo info) {
        System.out.println("AfterEach: " + info.toString());
    }

    @AfterAll
    public static void tearDownClass(TestInfo info) {
        System.out.println("AfterAll: " + info.toString());
    }

    @DisplayName("My Test Name")
    @Test
    public void testInfo(TestInfo info) {
        System.out.println("Info: " + info.toString());
    }

    @DisplayName("Repeated Test")
    @RepeatedTest(2)
    public void testRepeatedWithInfo(RepetitionInfo repeatInfo, TestInfo info, TestReporter reporter) {
        System.out.println("Info: " + info.toString());
        System.out.println("Repetition: " + repeatInfo.toString());
        reporter.publishEntry("Info", Integer.toString(repeatInfo.getTotalRepetitions()));
    }
}
