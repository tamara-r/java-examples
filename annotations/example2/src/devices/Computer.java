package devices;

import annotations.ClassField;

public class Computer {
    @ClassField(name = "name")
    String name;

    public Computer(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer: " +
                name;
    }
}
