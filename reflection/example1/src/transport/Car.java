package transport;

import java.text.DecimalFormat;

public class Car extends Vehicle{
    protected String brand;
    protected String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDistance() {
        return super.distance;
    }

    public void setDistance(double distance) {
        super.distance = distance;
    }

    public double getGasAmount() {
        return super.gasAmount;
    }

    public void setGasAmount(double gasAmount) {
        super.gasAmount = gasAmount;
    }

    @Override
    public double calculateConsumption() {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format(super.distance / super.gasAmount));
    }

    @Override
    public String toString() {
        return "Car [brand: " + brand + ", model=" + model + "]";
    }
}
