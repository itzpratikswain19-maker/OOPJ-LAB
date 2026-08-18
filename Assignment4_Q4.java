
import java.util.*;

class Assignment4_Q4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int a = sc.nextInt();

        System.out.println("Enter second no:");
        int b = sc.nextInt();

        System.out.println("Enter third no:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is greater.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println(c + " is greater.");
        }

        sc.close();
    }
}
