import model.*;
import model.baterry_company.Lizard;
import model.baterry_company.UltraEnergy;
import model.motor_company.DGS;
import model.motor_company.DivineMotors;
import model.weels_companies.GoodYear;
import model.weels_companies.Micheline;
import model.weels_companies.micheline_subdivision.Marks;
import service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Random random = new Random();

        List<Battery> batteryList= new ArrayList<>(List.of(
                new Lizard("Battery A", 12.4, true, 300, true),
                new UltraEnergy("Battery B", 22.6, true, 400, true),
                new Battery("Battery C", 14.7, false)
                ));

        List<Light> lightList = new ArrayList<>(List.of(
                new Light(ColorOfLight.WHITE, 3000),
                new Light(ColorOfLight.YELLOW, 5000),
                new Light(ColorOfLight.WHITE, 2000)
        ));

        List<Motor> motorList = new ArrayList<>(List.of(
                new DGS(new TypeOfMotor("Motor A", 4), 1.8, 89, "Titian"),
                new DivineMotors(new TypeOfMotor("Motor B", 6), 2.0, "B9", true),
                new Motor(new TypeOfMotor("Motor C", 8), 4.0)
        ));

        List<Person> personList = new ArrayList<>(List.of(
            new Person("Vasile", "Bas"),
            new Person("Nicu", "Grigorescu"),
            new Person("Florin", "Degea")
        ));

        List<Wheels> wheelsList = new ArrayList<>(List.of(
               new GoodYear("Micheline", 5, 2, 345, "Box"),
               new Micheline("Destroy", 5, 3, 1, 434),
               new Marks("Suzu", 6, 2, 2, 342, "Motocicles")
        ));

        List<TypeOfCar> typeOfCars = new ArrayList<>(List.of(
                new TypeOfCar("Cupe"),
                new TypeOfCar("Sedan"),
                new TypeOfCar("Cabriolet")
        ));

        List<TypeOfFuel> typeOfFuels = new ArrayList<>(List.of(
                new TypeOfFuel("Diesel"),
                new TypeOfFuel("Gasoline"),
                new TypeOfFuel("LGP")
        ));

        List<TypeOfGearBox> typeOfGearBoxes = new ArrayList<>(List.of(
                new TypeOfGearBox(true),
                new TypeOfGearBox(false)
        ));

        carService.addCar(new Cars(
                "Mercedes",
                "CMD213",
                wheelsList.get(random.nextInt(wheelsList.size()-1)),
                motorList.get(random.nextInt(motorList.size()-1)),
                typeOfCars.get(random.nextInt(typeOfCars.size()-1)),
                batteryList.get(random.nextInt(batteryList.size()-1)),
                typeOfGearBoxes.get(random.nextInt(typeOfCars.size()-1)),
                typeOfFuels.get(random.nextInt(typeOfFuels.size()-1)),
                List.of(personList.get(random.nextInt(personList.size()-1))),
                lightList.get(random.nextInt(lightList.size()-1)),
                12000,
                240,
                2000
                ));

        carService.addCar(new Cars(
                "AUDI",
                "CMD214",
                wheelsList.get(random.nextInt(wheelsList.size()-1)),
                motorList.get(random.nextInt(motorList.size()-1)),
                typeOfCars.get(random.nextInt(typeOfCars.size()-1)),
                batteryList.get(random.nextInt(batteryList.size()-1)),
                typeOfGearBoxes.get(random.nextInt(typeOfCars.size()-1)),
                typeOfFuels.get(random.nextInt(typeOfFuels.size()-1)),
                List.of(personList.get(random.nextInt(personList.size()-1))),
                lightList.get(random.nextInt(lightList.size()-1)),
                6500,
                160,
                1500
        ));

        carService.showCars();

    }
}