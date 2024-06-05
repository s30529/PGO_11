public class Car implements Comparable<Car>{
    private String name;
    private int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    @Override
    public int compareTo(Car otherCar){
        return Integer.compare(this.yearOfProduction, otherCar.yearOfProduction);
    }
    @Override
    public String toString(){
        return "Model: "+name+", Year: "+yearOfProduction;
    }
}
