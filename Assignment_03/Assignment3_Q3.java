//Q3. sWrite a program to calculate electricity bill using unit consumption.

import java.util.*;

class Assignment3_Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Previous Reading : ");
        double pr = sc.nextDouble();
        System.out.println("Enter Current Reading : ");
        double cr = sc.nextDouble();
        double unit = cr - pr;
        double bill = 0;
        if (unit <= 100) {
            bill = unit * 3.00;
        } else if (unit <= 500) {
            bill = (100 * 3) + (unit - 100) * 4;
        } else {
            bill = (100 * 3) + (400 * 4) + (unit - 500) * 6;
        }
        System.out.println("Total Electricity Bill : " + bill);
        sc.close();
    }
}
