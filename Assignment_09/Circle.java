// Assignment9_Q4

class Shape {

    static double pi = 3.14;
    double radius;

    void getPerimeter() {
        System.out.println("Perimeter");
    }

    void getArea() {
        System.out.println("Area");
    }
}

class Circle extends Shape {

    void getPerimeter() {
        System.out.println("Perimeter = " + (2 * pi * radius));
    }

    void getArea() {
        System.out.println("Area = " + (pi * radius * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 2.5;

        c.getPerimeter();
        c.getArea();
    }
}
