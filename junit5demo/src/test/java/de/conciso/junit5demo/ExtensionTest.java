package de.conciso.junit5demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExtensionTest {
    @Mock
    Supplier<String> supplier;

    @Test
    public void testWithMockito() {
        when(supplier.get()).thenReturn("Test");

        assertEquals("Test", supplier.get());
    }
}
