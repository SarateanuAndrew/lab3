package model.weels_companies;

import model.Wheels;

public class GoodYear extends Wheels {
    private double priceInDolars;
    private String typeOfPack;

    public GoodYear(String mark, int numberOfWheels, int width, double priceInDolars, String typeOfPack) {
        super(mark, numberOfWheels, width);
        this.priceInDolars = priceInDolars;
        this.typeOfPack = typeOfPack;
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
        return "GoodYear{" +
                "priceInDolars=" + priceInDolars +
                ", typeOfPack='" + typeOfPack + '\'' +
                '}';
    }

    public double getPriceInDolars() {
        return priceInDolars;
    }

    public void setPriceInDolars(double priceInDolars) {
        this.priceInDolars = priceInDolars;
    }

    public String getTypeOfPack() {
        return typeOfPack;
    }

    public void setTypeOfPack(String typeOfPack) {
        this.typeOfPack = typeOfPack;
    }
}
