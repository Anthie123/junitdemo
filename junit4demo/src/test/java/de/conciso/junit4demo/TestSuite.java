package de.conciso.junit4demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RuleTest.class,
        FixtureDemoTest.class})
public class TestSuite {
}
