package model;

public class Wheels extends RootPrins{
    private String mark;
    private int numberOfWheels;
    private int width;

    public Wheels() {
    }

    public Wheels(String mark, int numberOfWheels, int width){
        this.mark = mark;
        this.numberOfWheels = numberOfWheels;
        this.width = width;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "mark='" + mark + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", width=" + width +
                '}';
    }
}
