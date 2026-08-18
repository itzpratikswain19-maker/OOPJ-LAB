// Q2. Write a program to calculate gross salary using basic salary. 
//HRA (10% of basic), and DA (60% of basic)

import java.util.*;

class Assignment3_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        double sal = sc.nextDouble();
        double HRA = sal * 10 / 100;
        double DA = sal * 60 / 100;
        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        sc.close();
    }
}
