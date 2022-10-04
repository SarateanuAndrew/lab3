package model.weels_companies.micheline_subdivision;

import model.weels_companies.Micheline;

public class Marks extends Micheline {
    private String typeOfWheels;

    public Marks(String mark, int numberOfWheels, int width, int age, double priceInEuro, String typeOfWheels) {
        super(mark, numberOfWheels, width, age, priceInEuro);
        this.typeOfWheels = typeOfWheels;
    }

    public String getTypeOfWheels() {
        return typeOfWheels;
    }

    public void setTypeOfWheels(String typeOfWheels) {
        this.typeOfWheels = typeOfWheels;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public double getPriceInEuro() {
        return super.getPriceInEuro();
    }

    @Override
    public String getMark() {
        return super.getMark();
    }

    @Override
    public int getNumberOfWheels() {
        return super.getNumberOfWheels();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "Marks{" +
                "typeOfWheels='" + typeOfWheels + '\'' +
                '}';
    }
}
