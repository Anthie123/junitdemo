package de.conciso.junit5demo.util;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class TestCaseAggregator implements ArgumentsAggregator {

    @Override
    public TestCase aggregateArguments(ArgumentsAccessor arguments, ParameterContext context) {
        return new TestCase(arguments.getString(0), arguments.getInteger(1));
    }
}
