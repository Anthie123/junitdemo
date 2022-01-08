package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodName.class)
@TestMethodOrder(OrderAnnotation.class)
@TestClassOrder(org.junit.jupiter.api.ClassOrderer.OrderAnnotation.class)
//@TestClassOrder(org.junit.jupiter.api.ClassOrderer.ClassName.class)
public class TestOrderTest {

    @Test
    @Order(5)
    public void atest() {
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void dtest() {
        assertTrue(true);
    }

     @Test
     @Order(3)
    public void ctest() {
        assertTrue(true);
    }

    @Test
    @Order(4)
    public void btest() {
        assertTrue(true);
    }

    @Test
    @Order(1)
    public void etest() {
        assertTrue(true);
    }
    
    @Nested
    @Order(2)
    class TestClass1 {
    	@Test
    	void nestedTestA() {
    		assertTrue(true);
    	}
    }
    @Nested
    @Order(1)
    class TestClass2 {
    	@Test
    	void nestedTestB() {
    		assertTrue(true);
    	}
    }

}
