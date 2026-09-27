//Q1. Write a program to calculate the total and percentage of five subject. 

import java.util.*;

class Assignment3_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Mark : ");
        double phy = sc.nextDouble();
        System.out.println("Enter Chemistry Mark : ");
        double chem = sc.nextDouble();
        System.out.println("Enter Math Mark : ");
        double math = sc.nextDouble();
        System.out.println("Enter Computer Science Mark : ");
        double cs = sc.nextDouble();
        System.out.println("Enter Biology Mark : ");
        double bio = sc.nextDouble();
        double total = phy + chem + math + cs + bio;
        double per = total / 500 * 100;
        System.out.println("Total Mark Obtained : " + total);
        System.out.println("Percentage : " + per);
        sc.close();
    }
}
