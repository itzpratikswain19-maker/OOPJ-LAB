//Assignment-07_Question-04

import java.util.*;

class interest {

    void si(double principal, int time) {
        double rate = 5;
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    void si(int rate, int time) {
        double principal = 10000;
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        interest obj = new interest();
        System.out.println("Enter Principal Ammount: ");
        double p = sc.nextInt();
        System.out.println("Enter time period: ");
        int t = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();
        obj.si(p, t);
        obj.si(r, t);
    }
}
