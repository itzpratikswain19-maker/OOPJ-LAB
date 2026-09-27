
import java.util.*;

class Assignment4_Q2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first floating point no.:");
        double n1 = sc.nextDouble();

        System.out.println("Enter second floating point no.:");
        double n2 = sc.nextDouble();

        double a = n1 * 1000;
        double b = n2 * 1000;

        if (a == b) {
            System.out.println("The numbers are same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        sc.close();
    }
}
