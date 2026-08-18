/* Write a java program that calculate mathematics constant 'e' using the formula e = 1 + 1/1! + 1/2! + 1/3! + ... up to 5 terms */
class Assignment5_Q2 {

    public static void main(String args[]) {
        double e = 0;
        double fact = 1.0;
        for (int i = 1; i <= 5; i++) {
            fact *= i;
            e += 1.0 / fact;
        }
        System.out.println("The value of e is: " + e);
    }
}
