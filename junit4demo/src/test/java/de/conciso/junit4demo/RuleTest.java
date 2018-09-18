package de.conciso.junit4demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class RuleTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Supplier<String> supplier;

    @Test
    public void testWithMockito() {
        when(supplier.get()).thenReturn("Test");

        assertEquals("Test", supplier.get());
    }
}
