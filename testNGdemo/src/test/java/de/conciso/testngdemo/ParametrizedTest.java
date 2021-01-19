package de.conciso.testngdemo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {

    @Parameters("first")
    @BeforeMethod
    public void setUp(@Optional("optional setup parameter") String value) {
        System.out.println(value);
    }

    @Parameters("first")
    @Test
    public void test(@Optional("optional method parameter") String value)
    {
        Assert.assertEquals(value, "first parameter");
    }

    @DataProvider(name = "test")
    public Object[][] createData() {
        return new Object[][] {
            { "erster Wert", 36 },
            { "zweiter Wert", 37},
        };
    }
}

