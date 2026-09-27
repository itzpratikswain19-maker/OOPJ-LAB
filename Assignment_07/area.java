
import java.util.*;

class area {

    static void rectangle(int l, int b) {
        int Area = l * b;
        System.out.println("Arae of the rectangle: " + Area);
    }

    void square(int a) {
        int Area = a * a;
        System.out.println("Area of the square: " + Area);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sides of the rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter side of a square: ");
        int a = sc.nextInt();
        rectangle(l, b);
        area ar = new area();
        ar.square(a);
    }
}
