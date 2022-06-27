package web.service;

import web.model.Car;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {

    private static final Car[] cars = {
            new Car("BMW X", 6, Year.of(2015)),
            new Car("Mers S", 600, Year.of(2010)),
            new Car("Audi A", 5, Year.of(2020)),
            new Car("VAZ", 2106, Year.of(2000)),
            new Car("UAZ", 3165, Year.of(1990))
    };

    public static List<Car> getCars(int count) {
        return new ArrayList<>(Arrays.asList(Arrays.copyOf(cars, Math.min(count, 5))));
    }
}
