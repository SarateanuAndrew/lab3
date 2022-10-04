package model.motor_company;

import model.Motor;
import model.TypeOfMotor;

public class DGS extends Motor {
    private double weigth;
    private String metalUsed;

    public DGS(TypeOfMotor motorType, double capacity, double weigth, String metalUsed) {
        super(motorType, capacity);
        this.weigth = weigth;
        this.metalUsed = metalUsed;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getMetalUsed() {
        return metalUsed;
    }

    public void setMetalUsed(String metalUsed) {
        this.metalUsed = metalUsed;
    }

    @Override
    public String toString() {
        return "DGS{" +
                "weigth=" + weigth +
                ", metalUsed='" + metalUsed + '\'' +
                '}';
    }
}
