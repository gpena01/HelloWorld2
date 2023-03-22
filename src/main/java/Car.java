public class Car {
    private String model;
    private int year;

    public String getInfo() {
        return model + " " + year;
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
    }
}
