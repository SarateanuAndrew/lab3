package model.motor_company;

import model.Motor;
import model.TypeOfMotor;

public class DivineMotors extends Motor {
    private String typeOfPlastic;
    private boolean autoCold;

    public DivineMotors(TypeOfMotor motorType, double capacity, String typeOfPlastic, boolean autoCold) {
        super(motorType, capacity);
        this.typeOfPlastic = typeOfPlastic;
        this.autoCold = autoCold;
    }

    public String getTypeOfPlastic() {
        return typeOfPlastic;
    }

    public void setTypeOfPlastic(String typeOfPlastic) {
        this.typeOfPlastic = typeOfPlastic;
    }

    public boolean isAutoCold() {
        return autoCold;
    }

    public void setAutoCold(boolean autoCold) {
        this.autoCold = autoCold;
    }

    @Override
    public String toString() {
        return "DivineMotors{" +
                "typeOfPlastic='" + typeOfPlastic + '\'' +
                ", autoCold=" + autoCold +
                '}';
    }
}
