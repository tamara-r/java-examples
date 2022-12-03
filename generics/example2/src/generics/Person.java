package generics;

public class Person<T> implements Comparable<Person>{
    protected String firstName;
    protected String lastName;
    private T addon;

    public T getAddon() {
        return addon;
    }

    public void setAddon(T addon) {
        this.addon = addon;
    }

    @Override
    public int compareTo(Person p) {
        return this.firstName.compareTo(p.firstName);
    }
}
