package web.model;

import java.time.Year;

public class Car {

    private String model;
    private Integer series;
    private Year made;

    public Car() {}

    public Car(String model, Integer series, Year made) {
        this.model = model;
        this.series = series;
        this.made = made;
    }

    @Override
    public String toString() {
        return  "\nCar {" +
                " model='" + model + '\'' +
                ", series=" + series +
                ", made=" + made +
                " }";
    }
}
