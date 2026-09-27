// Assignment8_Q2\

import java.util.*;

class Rectangle {

    static int width, height;

    void area() {
        System.out.println("Area = " + width * height);
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (width + height)));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width:");
        width = sc.nextInt();

        System.out.println("Enter height:");
        height = sc.nextInt();

        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();

        sc.close();
    }
}
