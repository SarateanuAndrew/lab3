package model.weels_companies;

import model.Wheels;

public class Micheline extends Wheels {
    private int age;
    private double priceInEuro;

    public Micheline(String mark, int numberOfWheels, int width, int age, double priceInEuro) {
        super(mark, numberOfWheels, width);
        this.age = age;
        this.priceInEuro = priceInEuro;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
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
        return "Micheline{" +
                "age=" + age +
                ", price=" + priceInEuro +
                '}';
    }
}
