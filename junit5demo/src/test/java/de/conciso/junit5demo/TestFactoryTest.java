package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class TestFactoryTest {

    @DisplayName("TestFactory Demo")
    @TestFactory
    Stream<DynamicNode> dynamicTestCreation() {
        return Stream.of(
                dynamicContainer("Container", Stream.of(
                        dynamicTest("Test1", () -> assertTrue(true)),
                        dynamicTest("Test2", () -> assertFalse(false))
                )));
    }
}
