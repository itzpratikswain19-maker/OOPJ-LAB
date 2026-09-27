//Q4. Write a program to determine whether a number is positive, negative, or zero using operators.

import java.util.*;

class Assignment3_Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is Positive Number.");
        } else if (n < 0) {
            System.out.println(n + " is Negative Number.");
        } else {
            System.out.println(n + " is Zero.");
        }
        sc.close();
    }
}
