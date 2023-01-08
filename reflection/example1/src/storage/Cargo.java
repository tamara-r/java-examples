package storage;

public class Cargo implements Comparable<Cargo>{
    private double weight;
    private static int idGenerator = 1;
    public int id;


    public Cargo(double weight) {
        this.weight = weight;
        this.id = idGenerator++;
    }


    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Cargo c) {
        return Double.compare(this.weight, c.weight);
    }

    @Override
    public String toString() {
        return id + ". " + '[' + weight +']';
    }
}
