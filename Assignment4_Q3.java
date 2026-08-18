
import java.util.*;

class Assignment4_Q3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = sc.nextInt();

        System.out.println("Enter month (1-12):");
        int m = sc.nextInt();

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("This month has 31 days.");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("This month has 30 days.");
        } else if (m == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("This month has 29 days.");
            } else {
                System.out.println("This month has 28 days.");
            }
        } else {
            System.out.println("Invalid month.");
        }

        sc.close();
    }
}
