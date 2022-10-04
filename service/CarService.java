package service;

import model.Cars;

import java.util.ArrayList;
import java.util.List;


public class CarService {
    private static final List<Cars> CARS_LIST =  new ArrayList<>();
    public void showCars(){
        CARS_LIST.forEach(System.out::println);
    }

    public void addCar(Cars cars){
        CARS_LIST.add(cars);
    }

    public Cars findCarByNumber(String carNumber){
        return CARS_LIST.stream().filter(cars -> cars.getCarNumber().equals(carNumber)).findFirst().orElseThrow();
    }

    public void deleteCar(Cars cars){
        CARS_LIST.remove(cars);
    }

    public List<Cars> sortCarsByPrice(){
        return CARS_LIST.stream().sorted().toList();
    }

    public List<Cars> filterByPrice(int minPrice, int maxPrice){
        return CARS_LIST.stream().filter(cars -> (cars.getPrice() >= minPrice) && (cars.getPrice() <= maxPrice)).toList();
    }
}