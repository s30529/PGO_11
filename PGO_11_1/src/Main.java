import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford Focus",2006));
        cars.add(new Car("Ford Mustang",2014));
        cars.add(new Car("Toyota Rav4",2018));
        cars.add(new Car("Skoda octavia",2013));
        cars.add(new Car("Hyundai ix20",2012));
        cars.add(new Car("Hyundai i30",2010));
        cars.add(new Car("BMW E36",2002));
        cars.add(new Car("BMW M5",2018));
        cars.add(new Car("Mercedes-Benz C-Class",2017));
        cars.add(new Car("Subaru Impreza",2016));
        Collections.sort(cars);
        for(Car car: cars){
            System.out.println(car);
        }
    }
}