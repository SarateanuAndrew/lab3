package model;

public class TypeOfGearBox extends RootPrins{
    private boolean mechanic;

    public TypeOfGearBox() {
    }

    public TypeOfGearBox(boolean mechanic) {
        this.mechanic = mechanic;
    }

    public void show(){
        if (mechanic){
            System.out.println("Car has a mechanic gearbox");
            return;
        }
        System.out.println("Car has an automatic gearbox");
    }

}
