package model;

public class TypeOfFuel extends RootPrins{
    private String fuel;

    public TypeOfFuel() {
    }

    public TypeOfFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
