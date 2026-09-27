// Assignment9_Q5

class Vehicle {

    String make;
    String model;
    double fuel;

    Vehicle(String make, String model, double fuel) {
        this.make = make;
        this.model = model;
        this.fuel = fuel;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency calculation");
    }

    void distanceTraveled() {
        System.out.println("Distance travelled");
    }

    void maxSpeed() {
        System.out.println("Maximum speed");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Truck Fuel efficiency: 8 KM/L");
    }

    void distanceTraveled() {
        System.out.println("Truck distance: 400 KM");
    }

    void maxSpeed() {
        System.out.println("Truck maximum speed: 100 KM/h");
    }
}

class Car extends Vehicle {

    Car(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Car Fuel efficiency: 18 KM/L");
    }

    void distanceTraveled() {
        System.out.println("Car distance: 500 KM");
    }

    void maxSpeed() {
        System.out.println("Car maximum speed: 180 KM/h");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Motorcycle Fuel efficiency: 45 KM/L");
    }

    void distanceTraveled() {
        System.out.println("Motorcycle distance: 300 KM");
    }

    void maxSpeed() {
        System.out.println("Motorcycle maximum speed: 120 KM/h");
    }
}

class Main {

    public static void main(String[] args) {

        Car c = new Car("Maruti", "Swift", 30);

        System.out.println(c.make);
        System.out.println(c.model);
        c.fuelEfficiency();
        c.distanceTraveled();
        c.maxSpeed();
    }
}
