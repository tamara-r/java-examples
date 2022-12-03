package transport;

import storage.Cargo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Truck extends Vehicle {
    private double maximumWeight;
    public List<Cargo> cargos;

    public Truck (double maximumWeight) {
        this.maximumWeight = maximumWeight;
        cargos = new ArrayList<>();
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
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

    public Truck addCargo(Cargo cargo) {
        double sum = 0;
        for ( Cargo c : cargos) {
            sum += c.getWeight();
        }

        if(sum < maximumWeight) {
            cargos.add(cargo);
        } else {
            System.out.println("Weight limit is reached!");
        }

        return this;
    }

    public String sortedCargoList() {
        Collections.sort(cargos);
        String s = "";
        for (Cargo cargo : cargos) {
            s += cargo.toString() + "\n";
        }
        return s;
    }

    @Override
    public double calculateConsumption() {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format(super.distance / super.gasAmount));
    }


    @Override
    public String toString() {
        return "Truck [" +
                "maximumWeight=" + maximumWeight + "], sorted cargo list: \n" + sortedCargoList();
    }
}
