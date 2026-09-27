// Assignment9_Q1

class Vehicle {

    void drive() {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
