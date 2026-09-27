/* WAP to calculate the average of array element. */
import java.util.*;

class Assignment6_Q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < size; i++) {
            avg += arr[i];
        }
        avg /= size;
        System.out.println("The average of array is: " + avg);
    }
}
