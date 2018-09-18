package de.conciso.junit4demo;


import org.junit.*;

public class FixtureDemoTest {

    public FixtureDemoTest() {
        System.out.println("Constructor");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeAll");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterAll");
    }

    @Before
    public void setUp() {
        System.out.println("BeforeEach");
    }

    @After
    public void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    public void testMethod1() {
        System.out.println("Dies ist der erste Test");
    }

    @Test
    public void testMethod2() {
        System.out.println("Dies ist der zweite Test");
    }

    @Ignore
    @Test
    public void testMethod3() {
        System.out.println("Dies ist der ignored Test");
    }
}
