package devices;

import annotations.ClassFields;
import annotations.OperationSystem;

import java.text.DecimalFormat;

@OperationSystem(systemName = "iOS", version = 14)
public class Laptop extends Computer implements CalculatePrice{

    @ClassFields(name = "price")
    private double price;

    public Laptop(String name, double price) {
        super(name);
        this.price = price;
    }

    @SuppressWarnings("unused")
    public double getPrice() {
        return price;
    }
    @SuppressWarnings("unused")
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculatedPrice() {
        return this.price + this.price * 0.2;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        return "Laptop (" +
                "name: " + name + ", price: " + price +
                ", with taxes: " + decimalFormat.format(calculatedPrice()) + "$ )";
    }
}
