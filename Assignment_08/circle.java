// Assignment8_Q5

class circle {

    double radius;

    circle(double r) {
        radius = r;
    }

    void area() {
        double pi = 3.14;
        double a = pi * radius * radius;
        System.out.println("Area of circle:" + a);
    }

    void circumference() {
        double pi = 3.14;
        double p = 2 * pi * radius;
        System.out.println("Circumference of circle:" + p);
    }

    public static void main(String args[]) {
        circle c = new circle(2.5);
        c.area();
        c.circumference();
    }
}
