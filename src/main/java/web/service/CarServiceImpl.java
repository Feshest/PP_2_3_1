package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {

    static public List<Car> cars;

    static {
        cars = new ArrayList<>();

        cars.add(new Car((long) 1,"Nissan Murano", 2014));
        cars.add(new Car((long) 2,"Kia K5", 2020));
        cars.add(new Car((long) 3,"Kia Optima", 2018));
        cars.add(new Car((long) 4,"Mercedes Benz", 2013));
        cars.add(new Car((long) 5,"Reno Logan", 2010));
    }

    static public List<Car> listCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
