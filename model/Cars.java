package model;

import java.util.List;

public class Cars extends RootPrins{
    private String mark;
    private String carNumber;
    private Wheels wheels;
    private Motor motor;
    private TypeOfCar typeOfCar;
    private Battery battery;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private List<Person> personAllowedToDrive;
    private Light light;
    private int price;
    private int maxSpeed;
    private double mass;

    public Cars(String mark, String carNumber, Wheels wheels, Motor motor, TypeOfCar typeOfCar, Battery battery, TypeOfGearBox typeOfGearBox,
                TypeOfFuel typeOfFuel, List<Person> personAllowedToDrive, Light light, int price, int maxSpeed, double mass) {
        this.mark = mark;
        this.carNumber = carNumber;
        this.wheels = wheels;
        this.motor = motor;
        this.typeOfCar = typeOfCar;
        this.battery = battery;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.personAllowedToDrive = personAllowedToDrive;
        this.light = light;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public List<Person> getPersonAllowedToDrive() {
        return personAllowedToDrive;
    }

    public void setPersonAllowedToDrive(List<Person> personAllowedToDrive) {
        this.personAllowedToDrive = personAllowedToDrive;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "mark='" + mark + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", wheels=" + wheels +
                ", motor=" + motor +
                ", typeOfCar=" + typeOfCar +
                ", battery=" + battery +
                ", typeOfGearBox=" + typeOfGearBox +
                ", typeOfFuel=" + typeOfFuel +
                ", personAllowedToDrive=" + personAllowedToDrive +
                ", light=" + light +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                '}';
    }

    public void showMessage(String a){
        System.out.println(a);
    }
}
