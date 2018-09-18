package de.conciso.junit4demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestRunnerTest {
    @Mock
    Supplier<String> supplier;

    @Test
    public void testWithMockito() {
        when(supplier.get()).thenReturn("Test");

        assertEquals("Test", supplier.get());
    }
}
