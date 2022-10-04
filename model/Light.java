package model;

public class Light extends RootPrins{
    private ColorOfLight colorOfLight;
    private double power;

    public Light() {
    }

    public Light(ColorOfLight colorOfLight, double power) {
        this.colorOfLight = colorOfLight;
        this.power = power;
    }

    public ColorOfLight getColorOfLight() {
        return colorOfLight;
    }

    public void setColorOfLight(ColorOfLight colorOfLight) {
        this.colorOfLight = colorOfLight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Light{" +
                "colorOfLight=" + colorOfLight.toString() +
                ", power=" + power +
                '}';
    }
}
