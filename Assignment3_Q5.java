//Q5. Write a program to calculate profit or loss percentage.

import java.util.*;

class Assignment3_Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Buy Ammount : ");
        double ba = sc.nextDouble();
        System.out.println("Enter Selling Ammount : ");
        double sa = sc.nextDouble();
        if (sa > ba) {
            double profit = sa - ba;
            double profitPer = (profit / ba) * 100;
            System.out.println("Profit Ammount : " + profit);
            System.out.println("Percentage of Profit : " + profitPer);
        } else if (ba > sa) {
            double loss = ba - sa;
            double lossPer = (loss / ba) * 100;
            System.out.println("Loss Ammount : " + loss);
            System.out.println("Percentage of Loss : " + lossPer);
        } else {
            System.out.println("You have no profit and no loss.");
        }
        sc.close();
    }
}
