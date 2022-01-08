package de.conciso.junit5demo;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


@Suite
@SuiteDisplayName("JUnit 5 Suite Demo")
@SelectClasses({
        ExtensionTest.class,
        FixtureDemoTest.class,
        TagTest.class
})
@IncludeTags({"(fast | slow)"})
public class TestSuite {
}
