package model;

public class Motor extends RootPrins{
    private TypeOfMotor motorType;
    private double capacity;

    public Motor() {
    }

    public Motor(TypeOfMotor motorType, double capacity) {
        this.motorType = motorType;
        this.capacity = capacity;
    }

    public TypeOfMotor getMotorType() {
        return motorType;
    }

    public void setMotorType(TypeOfMotor motorType) {
        this.motorType = motorType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "motorType=" + motorType +
                ", capacity=" + capacity +
                '}';
    }
}
