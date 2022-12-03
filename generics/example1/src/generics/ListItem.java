package generics;

public class ListItem<T> {
    private T element;

    public ListItem(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
