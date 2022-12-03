package generics;

public class Book <T extends Number> {
    private String name;
    private String author;
    private T price;

    public Book(String name, String author, T price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [" +
                "name: '" + name + '\'' +
                ", author: '" + author + '\'' +
                ", price: " + price +
                " RSD ]";
    }
}
