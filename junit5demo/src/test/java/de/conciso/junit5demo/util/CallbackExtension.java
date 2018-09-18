package de.conciso.junit5demo.util;

import org.junit.jupiter.api.extension.*;

import java.util.stream.Stream;

public class CallbackExtension implements Extension,
        BeforeAllCallback, BeforeEachCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback,
        AfterEachCallback, AfterAllCallback
        //ExecutionCondition,
        //TestInstanceFactory,
        //TestInstancePostProcessor,
        //ParameterResolver,
        //TestExecutionExceptionHandler,
        //TestTemplateInvocationContextProvider
{

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("afterAll");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("afterEach");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("afterTestExecution");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("beforeAll");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("beforeEach");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("beforeTestExecution");
    }
}
