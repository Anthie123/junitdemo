package de.conciso.junit5demo.util;

public class TestCase {
    private final String name;
    private final int number;

    public TestCase(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "String: " + getName() + "int: " + getNumber();
    }
}
