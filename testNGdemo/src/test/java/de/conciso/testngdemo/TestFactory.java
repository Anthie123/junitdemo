package de.conciso.testngdemo;


import org.testng.annotations.Factory;

public class TestFactory {

    @Factory
    public Object[] createInstance() {
        Object[] result = new Object[10];
        for (int i = 0; i < 10 ; i++) {
            result[i] = new FactoryCreatedTest(i * 5);
        }
        return result;
    }

}
