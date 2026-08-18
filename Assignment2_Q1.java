
class Assignment2_Q1 {

    public static void main(String args[]) {
        int num = 123;
        int sum = 0;
        int i = num;
        while (i != 0) {
            sum = sum + i % 10;
            i /= 10;
        }
        System.out.println("The sum is : " + sum);
    }
}
