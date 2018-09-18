package de.conciso.junit5demo;

import org.junit.jupiter.api.*;

interface DefaultMethodInterface {

    @BeforeAll
    static void setUpClass() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    default void setUp() {
        System.out.println("BeforeEach");
    }

    @Test
    default void myTestInInterface() {
        System.out.println("myTestInInterface");
    }

    @AfterEach
    default void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("AfterAll");
    }

}

public class InterfaceTest implements DefaultMethodInterface {

    @Test
    public void myTestInClass() {
        System.out.println("myTestInClass");
    }
}

