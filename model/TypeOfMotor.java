package model;

public class TypeOfMotor extends RootPrins{
    private String mark;
    private int numberOfPistons;

    public TypeOfMotor(String mark, int numberOfPistons) {
        this.mark = mark;
        this.numberOfPistons = numberOfPistons;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumberOfPistons() {
        return numberOfPistons;
    }

    public void setNumberOfPistons(int numberOfPistons) {
        this.numberOfPistons = numberOfPistons;
    }

    @Override
    public String toString() {
        return "TypeOfMotor{" +
                "mark='" + mark + '\'' +
                ", numberOfPistons=" + numberOfPistons +
                '}';
    }
}
